package Main;
import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import Settings.*;
import Vista.*;
public class App {
    public static void main(String[] args) throws Exception {

        ReSettings re = new ReSettings();
        String Sett = re.getTheme();
        PanelInicial inicio = new PanelInicial();

        if(Sett.equals("Dark")){
                try {
                    inicio.setState(false);
                    UIManager.setLookAndFeel(new FlatDarkLaf());
                }catch (Exception ex) {
                    System.err.println( "Error al inicializar LaF" );
                }
        }
        else if(Sett.equals("Light")){
            try {
                inicio.setState(true);
                UIManager.setLookAndFeel(new FlatLightLaf());
            }catch (Exception ex) {
                System.err.println( "Error al inicializar LaF" );
            }
        }
        
         Window W = new Window();
         W.setVisible(true);
    }

}
