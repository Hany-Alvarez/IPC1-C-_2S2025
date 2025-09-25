/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arenausac;

import clases.Clase1;

/**
 *
 * @author hanya
 */
public class ArenaUsac {

    public static void main(String[] args) {
     Clase1 C=new Clase1("Arena de Peleas Pokemón_"+"_PID de la ventanta: "+getPID());
     C.setVisible(true);
    
    }
    
    public static String getPID(){//Para ver si  realmente la ventana se cerro y no solo se oculto
        return java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
    }
}
