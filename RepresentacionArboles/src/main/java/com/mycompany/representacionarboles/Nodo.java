/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.representacionarboles;

/**
 *
 * @author huasc
 */
public class Nodo {
    int dato;
    Nodo sig;
    public Nodo(int a)
    {
        dato = a;
        sig = null;
    }
    public void mostrar()
    {
        System.out.println("dato: "+dato);
    }
}
