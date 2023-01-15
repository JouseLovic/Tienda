package com.example;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.junit.Test;
import org.slf4j.Marker;

import Settings.*;
import junit.framework.Assert;
public class AppTest 
{

    //these is test for create and load my array of settings
    @Test
    public void shouldSaveMyArraygSetting(){

        String[] nArray = {"Light", "Arial", "Plain", "22"};
        SaveSetting save = new SaveSetting();
        save.saveSetting(nArray);

    }

    @Test
    public void shouldReadMyArraySetting(){

        ReSettings configTest = new ReSettings();
        String[] settings = configTest.getSetting();
        String tema = settings[0];
        String fuente = settings[1];
        String estilo = settings[2];
        int size = Integer.parseInt(settings[3]);
        Assert.assertEquals("Light", tema);
        Assert.assertEquals("Arial", fuente);
        Assert.assertEquals("Plain", estilo);
        Assert.assertEquals(22, size);

    }

    //This is for create a directory if not exist, and create a file config default if not exist in the directory
    @Test
    public void shouldValidateIfConfigTestExist(){
    
        File directorio = new File("C:\\KOULIN\\Settings");
        File directoryImages = new File("C:\\KOULIN\\Images");
        File fileSetting = new File("C:\\KOULIN\\Settings\\Config.dat");
        
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
        if(!directoryImages.exists()){
            if (directoryImages.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
        if(!fileSetting.exists()){
            String[] nArray = {"Light", "Arial", "Plain", "22"};
            SaveSetting save = new SaveSetting();
            save.saveSetting(nArray);
        }
    }

    @Test
    public void shouldCreateImagesDefaultOfProgram(){

        
        try {
            FileOutputStream fileOut = new FileOutputStream("");
            FileInputStream fileIn = new FileInputStream("");
        } catch (FileNotFoundException e) {
           
            e.printStackTrace();
        }
        
        


    }

    //It´s working good
    @Test
    public void validateGmail(){

        String email = "HectorJosé@gmail.com";
        Pattern patron = Pattern.compile("^(([a-zA-z0-9])(?!.*\\s).*@gmail.com)$");
        Matcher match = patron.matcher(email);
        if(match.find()){
            System.out.println("Encontró");
        }
        Assert.assertEquals(true, match.matches());

    }



}
