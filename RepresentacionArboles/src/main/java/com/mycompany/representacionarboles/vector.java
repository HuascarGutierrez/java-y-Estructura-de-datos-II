/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.representacionarboles;
import java.util.Scanner;
/**
 *
 * @author huasc
 */

public class vector {
    Nodo inicio;
    Nodo fin;
    Scanner leer = new Scanner(System.in);
    public vector()
    {
        inicio = null;
    }
    public void agregar(int dato)
    {
        Nodo nuevo = new Nodo(dato);
        if(inicio == null)
        {
            inicio = nuevo;
            fin = inicio;
        }
        else
        {
            fin.sig=nuevo;
            fin = fin.sig;
        }
    }
    public void mostrar()
    {
        Nodo actual = inicio;
        while(actual!=null)
        {
            System.out.print(actual.dato + "->");
            actual = actual.sig;
        }
        System.out.println("");
    }
}
