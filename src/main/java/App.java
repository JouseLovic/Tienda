
import javax.swing.*;
import Controlador.ControllerMenu;
import Controlador.ControllerNewProduct;
import ControladorThreads.ControllerProducts;
import ControladorThreads.ControllerVendors;
import com.formdev.flatlaf.*;
import Controlador.Settings.ReSettings;
import Vista.*;

public class App {
    public static void main(String[] args) {

        ReSettings re = new ReSettings();
        String Sett = re.getTheme();
        PanelInicial inicio = new PanelInicial();

        try{
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        ControllerMenu menu = new ControllerMenu(re.getLanguageSelected());
        ControllerNewProduct nProduct = new ControllerNewProduct(re.getLanguageSelected());

        Window W = new Window();
        W.setVisible(true);

        ControllerProducts productsThread = new ControllerProducts();
        productsThread.start();
        ControllerVendors provThread = new ControllerVendors();
        provThread.start();

    }

}
