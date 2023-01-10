import javax.swing.UIManager;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;

import Vista.*;
public class App {
    public static void main(String[] args) throws Exception {

        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println( "Error al inicializar LaF" );
        }
        
         Window W = new Window();
         W.setVisible(true);

    }
}
