import javax.swing.UIManager;

import ControladorThreads.ControllerProducts;
import ControladorThreads.ControllerVendors;
import Vista_Formulario.PanelEntrada;
import Vista_Formulario.PanelNuevoProducto;
import Vista_Register.PanelNuevaFactura;
import com.formdev.flatlaf.*;

import Controlador.Settings.ReSettings;
import Vista.*;
public class App {
    public static void main(String[] args) throws Exception {

        ReSettings re = new ReSettings();
        String Sett = re.getTheme();
        PanelInicial inicio = new PanelInicial();
        PanelNuevoProducto nProducto = new PanelNuevoProducto();
        PanelNuevaFactura nFactura = new PanelNuevaFactura();
        PanelEntrada entradas = new PanelEntrada();

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

        ControllerProducts productsThread = new ControllerProducts();
        productsThread.start();
        ControllerVendors provThread = new ControllerVendors();
        provThread.start();

    }

}
