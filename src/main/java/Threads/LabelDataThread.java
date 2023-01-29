package Threads;

import Controllers.*;
import javax.swing.*;

public class LabelDataThread extends Thread {

    JLabel etiStock, etiVenta, etiEntries, etiVendor;

        public LabelDataThread(JLabel labelS, JLabel labelV){
            etiStock = labelS;
            etiVendor = labelV;
        }

    @Override
    public void run() {

        while(true){

            try {
                Thread.sleep(350);
                    ControllerPInitial.getCantidadStock(etiStock);
                    ControllerNVendor.getQuantityVendor(etiVendor);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
