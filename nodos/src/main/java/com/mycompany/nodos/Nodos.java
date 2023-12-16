/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nodos;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class Nodos {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner (System.in);
        Nodo n1 = new Nodo();
        Nodo salvaje;
        salvaje = n1; //puntero
        System.out.println("Esto es el dato: " + salvaje.dato);
        Nodo n2 = new Nodo(444);
        n1.siguiente = n2;
        n2.siguiente = null;
        //desde aqui se dejo la clase
        while(true)
        {
            System.out.println("OPCIONES");
            System.out.println("1. Imprimir todos");
            System.out.println("2. Imprimir solo");
            System.out.println("3. Imprimir solos");
            int a =leer.nextInt();
            n1.mostrar(a);
        }
    }
}
