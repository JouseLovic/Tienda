package Threads;

import View.PanelProveedores;

public class VendorsThread extends Thread{

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
