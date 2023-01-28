package Threads;

import ViewFormulary.PanelNuevoProducto;

public class ProductsThread extends Thread{

    @Override
    public void run(){

                while(true) {
                    try {
                        Thread.sleep(100);
                        if (!PanelNuevoProducto.getIsVisible()) {
                            PanelNuevoProducto.chargeTable();
                        }
                        if(PanelNuevoProducto.getIsVisible() && PanelNuevoProducto.getContador()==0){
                            PanelNuevoProducto.chargeTable();
                            PanelNuevoProducto.setContador(1);
                        }

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

    }



}