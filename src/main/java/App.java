
import javax.swing.*;
import Controllers.ControllerMenu;
import Controllers.ControllerNProduct;
import Threads.EntriesThread;
import Threads.ProductsThread;
import Threads.VendorsThread;
import com.formdev.flatlaf.*;
import Controllers.Settings.ReSettings;
import View.*;

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
        ControllerNProduct nProduct = new ControllerNProduct(re.getLanguageSelected());

        Window W = new Window();
        W.setVisible(true);

        ProductsThread productsThread = new ProductsThread();
        productsThread.start();
        VendorsThread provThread = new VendorsThread();
        provThread.start();
        EntriesThread entThread = new EntriesThread();
        entThread.run();

    }

}
