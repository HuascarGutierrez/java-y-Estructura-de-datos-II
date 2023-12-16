/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nodos;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class Nodo {
    int dato;
    Nodo siguiente;
    Scanner leer = new Scanner(System.in);
    public Nodo ()
    {
        System.out.println("Introduzca el dato");
        dato=leer.nextInt();
        siguiente=null;
    }

    public Nodo(int dato) {
        this.dato = dato;
        siguiente = null;
    }
    
    public void mostrar()
    {
        System.out.println("dato: " + dato);
        System.out.println("siguiente" + siguiente);
    }

    public void mostrar (int j)
    {
        switch(j)
        {
            case 1: 
                System.out.println("Opcion 1:");
                System.out.println("dato: " + dato);
                System.out.println("siguiente: " + siguiente);
                break;
            case 2: 
                System.out.println("Opcion 2:");
                System.out.println("dato: " + dato);
                break;
            case 3: 
                System.out.println("Opcion 3:");
                System.out.println("siguiente: " + siguiente);
                break;
            default: 
                System.out.println("Dato incorrecto, seleccione otro");
        }
    }
}
