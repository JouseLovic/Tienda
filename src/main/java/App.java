import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import ControladorThreads.*;
import Settings.*;
import Vista.*;
public class App {
    public static void main(String[] args) throws Exception {

        ReConfig re = new ReConfig();
        String Sett = re.getTheme();
        
        ControllerCompruebaSettings hilo = new ControllerCompruebaSettings();
        //hilo.start();

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
