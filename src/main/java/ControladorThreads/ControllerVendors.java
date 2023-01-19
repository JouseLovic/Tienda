package ControladorThreads;

import Vista.PanelProveedores;
import Vista.PanelProveedores;

import javax.naming.ldap.Control;

public class ControllerVendors extends Thread{

    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(100);
                if(!PanelProveedores.getIsVisibleProv()){
                    PanelProveedores.chargeTable();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }


    
    
}
