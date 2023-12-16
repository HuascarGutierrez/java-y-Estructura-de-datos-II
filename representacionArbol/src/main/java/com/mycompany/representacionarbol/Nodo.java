/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.representacionarbol;
import java.util.Scanner;
/**
 *
 * @author huasc
 */
public class Nodo {
    int dato;
    Nodo izq;
    Nodo der;
    Scanner leer= new Scanner(System.in);
    public Nodo()
    {
        System.out.println("Ingrese el dato: ");
        dato = leer.nextInt();
        this.izq = null;
        this.der = null;
    }
    public Nodo(int x)
    {
        dato = x;
        izq = null;
        der = null;
    } 
    public void mostrar()
    {
        System.out.println("dato: "+dato);
        System.out.println("izq: "+izq);
        System.out.println("der: "+der);
    }
}
