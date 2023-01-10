package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

import Settings.*;
import junit.framework.Assert;
public class AppTest 
{

    @Test
    public void shouldSaveAndReadString(){

        SaveSetting save = new SaveSetting("Light");
        save.saveSetting();
        LoadSetting load = new LoadSetting();
        Configuration setting = new Configuration(load.loadSetting());
        String Sett = setting.getSetting();
        Assert.assertEquals("Light", Sett);
      
    }
    
    @Test
    public void shouldReadStringInmediatly(){

        
    }


}
