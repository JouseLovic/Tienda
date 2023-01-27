package Controlador.Settings;

import Controlador.Settings.LoadSetting;

import java.util.Arrays;

public class ReSettings {

    private static String[] Settings = null;
    private LoadSetting load = null;

    public ReSettings(){
        load = new LoadSetting();
        Settings = new String[11];
        Settings = load.loadSetting();
    }

    public String[] getSetting(){
        return Settings;
    }

    public String getTheme(){
        return Settings[0];
    }

    public String getFont(){
        return Settings[1];
    }

    public String getStyle(){
        return Settings[2];
    }

    public int getSize(){
        return Integer.parseInt(Settings[3]);
    }

    public boolean getLanguageSelected(){ return Boolean.parseBoolean(Settings[4]);}

    public static String getTitleLogin(){ return Settings[5]; }

    public static String getTitleInventary(){ return Settings[6]; }

    public static String getTitleEntries(){ return Settings[7]; }

    public static String getTitleBill(){ return Settings[8]; }

    public static String getTitleVendors(){ return Settings[9]; }

    public static String getUser(){ return Settings[10]; }

    public static String getPasswordUser(){ return Settings[11]; }

    public static String getRol(){ return Settings[12]; }

    @Override
    public String toString() {
        return "ReConfigTest [Settings=" + Arrays.toString(Settings) + "]";
    }


}

