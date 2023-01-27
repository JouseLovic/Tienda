package ControladorThreads;

import Modelo.DB;
import Vista.PanelInicial;
import Vista_Formulario.PanelNuevoProducto;
import java.awt.*;
import java.sql.*;
import DAO.*;

public class ControllerProducts extends Thread{

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