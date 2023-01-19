package ControladorThreads;

import Vista.WindowVendors;

public class ControllerVendors extends Thread{

    @Override
    public void run() {

        while(true){
            try {
                Thread.sleep(100);
                if(!WindowVendors.getIsVisibleProv()){
                    WindowVendors.chargeTable();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }




        }

    }


    
    
}
