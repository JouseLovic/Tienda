package Settings;

import java.util.Arrays;

public class ReConfig {
    
    private String[] Settings = null;
    private LoadSetting load = null;

    public ReConfig(){
        load = new LoadSetting();
        Settings = new String[4];
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

    @Override
    public String toString() {
        return "ReConfigTest [Settings=" + Arrays.toString(Settings) + "]";
    }

    

}
