/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.representacionarboles;

/**
 *
 * @author huasc
 */
public class Pila {
    Nodo cima;
    public Pila()
    {
        cima = null;
    }
    public void agregar(int dato)
    {
        Nodo nuevo = new Nodo(dato);
        if(cima==null)
        {
            cima = nuevo;
        }
        else
        {
            nuevo.sig = cima;
            cima = nuevo;
        }
    }
    public void mostrar()
    {
        Nodo actual = cima;
        while(actual!=null)
        {
            actual.mostrar();
            actual = actual.sig;
        }
    }
    public void sacar()
    {
        cima = cima.sig;
    }
}
