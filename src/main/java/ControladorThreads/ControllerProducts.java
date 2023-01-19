package ControladorThreads;

import Vista_Formulario.PanelNewProduct;

public class ControllerProducts extends Thread{

    @Override
    public void run(){

                while(true) {
                    try {
                        Thread.sleep(100);
                        if (!PanelNewProduct.getIsVisible()) {
                            PanelNewProduct.chargeTable();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

    }



}