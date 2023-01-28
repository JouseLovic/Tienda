package Threads;

import Controllers.*;
import javax.swing.*;

public class LabelDataThread extends Thread {

    JLabel etiStock, etiVenta, etiEntries, etiOuts;

        public LabelDataThread(JLabel label){
            etiStock = label;
        }

    @Override
    public void run() {

        while(true){

            try {
                Thread.sleep(350);
                    ControllerPInitial.getCantidadStock(etiStock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
