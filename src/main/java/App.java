import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import Settings.*;
import Vista.*;
public class App {
    public static void main(String[] args) throws Exception {

        LoadSetting load = new LoadSetting();
        Configuration setting = new Configuration(load.loadSetting());
        String Sett = setting.getSetting();

        if(Sett.equals("Dark")){
                try {
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                }catch (Exception ex) {
                    System.err.println( "Error al inicializar LaF" );
                }
        }
        else if(Sett.equals("Light")){
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
            }catch (Exception ex) {
                System.err.println( "Error al inicializar LaF" );
            }
        }
        
         Window W = new Window();
         W.setVisible(true);

    }
}
