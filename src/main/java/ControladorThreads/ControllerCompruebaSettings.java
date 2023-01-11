package ControladorThreads;

import Vista.*;

public class ControllerCompruebaSettings extends Thread{


    @Override
    public void run() {
        
        while(true){
            //la idea de esta clase, es que compruebe que tipo de configuracion tiene, y dependiendo de lo que le entregue la comprobación del main
            //ejecutará los metodos para dark o para light, eso si, hay que comprobar que lo haga

            if(PanelInicial.getState()==true){
                System.out.println("Es visible");
            }
            else{
                System.out.println("No es visible");
            }

         }
    }
    
    
}

