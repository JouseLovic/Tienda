

import Controlador.ControllerMandaTablasGlobal;
import Vista.*;


public class App {
    public static void main(String[] args) throws Exception {
        
         Window W = new Window();
         W.setVisible(true);

         ControllerMandaTablasGlobal hilo = new ControllerMandaTablasGlobal();
         hilo.start();
    }
}
