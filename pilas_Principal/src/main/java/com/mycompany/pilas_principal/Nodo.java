/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas_principal;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class Nodo {
    String dato;
    Nodo siguiente;
    Scanner leer = new Scanner(System.in);
/*    
    public Nodo ()
    {
        System.out.println("Introduzca el dato");
        dato=leer.nextLine();
        siguiente=null;
    }
*/
    public Nodo(String dato) 
    {
        this.dato = dato;
        this.siguiente = null;
    }
    
    public void mostrar()
    {
        System.out.println("dato: " + dato);
        System.out.println("siguiente: " + siguiente);
    }
}
