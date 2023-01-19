package ControladorThreads;

import Vista_Formulario.PanelNuevoProducto;

public class ControllerProducts extends Thread{

    @Override
    public void run(){

                while(true) {
                    try {
                        Thread.sleep(100);
                        if (!PanelNuevoProducto.getIsVisible()) {
                            PanelNuevoProducto.chargeTable();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

    }



}