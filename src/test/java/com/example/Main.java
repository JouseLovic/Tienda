package com.example;
import java.util.*;
import java.util.regex.*;

import javax.swing.JOptionPane;
import javax.swing.SpinnerDateModel;

public class Main {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
            String sexo = "";
            int numero = 0;
            while(true){
            System.out.println("Escribe M o F");
            numero = entrada.nextInt();
            System.out.println(numero+": "+ValidadNumeros(""+numero+""));
            }
         }

         public static boolean ValidadSexo(String texto){//para id, precio, cantidad
            return texto.matches("^([F-M]{0,3})$");
         }

         public static boolean ValidadNumeros(String texto){//para id, precio, cantidad
            return texto.matches("^-?[0-9]{0,99999999}+$");
         }
    
}

  