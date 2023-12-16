/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emi.repasoresolucion;

/**
 *
 * @author huasc
 */
public class Nodo {
    String dato;
    Nodo sig;
    Nodo (String d)
    {
        dato = d;
        sig = null;
    }
    void mostrar()
    {
        System.out.println("dato: "+dato);
        System.out.println("siguiente: "+sig);
    }
}
