package com.example;

import org.junit.Test;
import PruebaSetting.*;
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

        ReConfig configTest = new ReConfig();
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

        //este es uno para verificar si un campo existe o no, y siempre se hara desde el inicio de la app, ya que asi si no existe, creamos una conf por default
        //tambien de una puedes verificar, como crear un directorio si no existe


    }

}
