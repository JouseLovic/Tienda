package Settings;

import java.io.Serializable;

public class Configuration implements Serializable{
    
    private String theme;

        public Configuration(String theme){
            this.theme = theme;
        }

        public String getSetting(){
            return theme;
        }

        public void setSetting(String theme){
            this.theme = theme;
        }

}
