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
public class Arbol {
    int toca;
    Nodo raiz;
    Scanner leer = new Scanner(System.in);
    public Arbol()
    {
        raiz = null;
        toca = 1;
    }
    public void agregar()
    {
        Nodo nuevo = new Nodo();
        if(raiz == null)
        {
            raiz = nuevo;
        }
        else
        {
            Nodo padre = raiz;
            while (true)
            {
                switch(toca)
                {
                    case 1: if(padre.izq == null)
                    {
                        padre.izq =  nuevo;
                        toca = 2;
                        return;
                    }
                    else
                    {
                        padre=padre.izq;
                    }
                        break;
                    case 2: if(padre.der == null)
                    {
                        padre.der =  nuevo;
                        toca = 1;
                        return;
                    }
                        break;
                    default: System.out.println("Sin datos de ingreso");
                }
            }
        }
    }
}
