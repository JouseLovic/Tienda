package com.example;

import java.io.*;
import java.util.regex.*;
import org.junit.Test;

import Controlador.*;
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
    
        File directorio = new File("src\\main\\java\\Settings");
        File fileSetting = new File("src\\main\\java\\SettingsConfig.dat");
        
        if (!directorio.exists()) {
             directorio.mkdirs();   
            System.out.println("Directorio creado");  
        }
        if(!fileSetting.exists()){
            String[] nArray = {"Light", "Arial", "Plain", "22"};
            SaveSetting save = new SaveSetting();
            save.saveSetting(nArray);
            System.out.println("Configuraciones por defecto creadas");
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
