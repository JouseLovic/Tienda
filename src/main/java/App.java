import javax.swing.UIManager;

import ControladorThreads.ControllerProducts;
import ControladorThreads.ControllerVendors;
import com.formdev.flatlaf.*;

import Controlador.Settings.ReSettings;
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

        ControllerProducts productsThread = new ControllerProducts();
        ControllerVendors provThread = new ControllerVendors();
        productsThread.start();
        provThread.start();
        
         Window W = new Window();
         W.setVisible(true);
    }

}
