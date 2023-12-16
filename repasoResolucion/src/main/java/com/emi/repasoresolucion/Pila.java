/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.emi.repasoresolucion;

/**
 *
 * @author huasc
 */
public class Pila {
    Nodo cima;
    int cant;
    Pila()
    {
        cima = null;
        cant = 0;
    }
    void agregar(String d)
    {
        Nodo nuevo = new Nodo(d);
        if(cima == null)
            cima = nuevo;
        else
        {
            nuevo.sig = cima;
            cima = nuevo;
        }
        cant++;
    }
    Nodo sacar()
    {
        Nodo aux;
            aux = cima;
            cima = cima.sig;
            aux.sig = null;
            cant--;
        return aux;
    }
    void mostrar()
    {
        Nodo actual;
        actual = cima;
        while(actual!=null)
        {
            actual.mostrar();
            actual = actual.sig;
        }
    }
}
