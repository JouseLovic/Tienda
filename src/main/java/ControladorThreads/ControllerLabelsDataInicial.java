package ControladorThreads;

import Controlador.*;
import javax.swing.*;

public class ControllerLabelsDataInicial extends Thread {

    JLabel etiStock, etiVenta, etiEntries, etiOuts;

        public ControllerLabelsDataInicial(JLabel label){
            etiStock = label;
        }

    @Override
    public void run() {

        while(true){

            try {
                Thread.sleep(350);
                    controllerInicial.getCantidadStock(etiStock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
