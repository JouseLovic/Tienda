package Settings;

public class Reconfig {
    
    private String theme = null;
    private Configuration setting;
    private LoadSetting load;

    public Reconfig(){
        LoadSetting load = new LoadSetting();
        Configuration setting = new Configuration(load.loadSetting());
        this.theme = setting.getSetting();
    }

    public String getTheme(){
        return theme;
    }

}
