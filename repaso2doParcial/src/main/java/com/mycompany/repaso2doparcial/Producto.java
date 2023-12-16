/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso2doparcial;
import java.util.Scanner;
/**
 *
 * @author huasc
 */
public class Producto {
    Nodo entrada;
    Nodo salida;
    Scanner leer = new Scanner(System.in);
    public Producto ()
    {
        entrada = null;
        salida = null;
    }
    public void ingresoProducto()
    {
        Nodo nuevo = new Nodo();
        if(entrada == null)
        {
            entrada = nuevo;
            salida = nuevo;
        }
        else
        {
            nuevo.sig = entrada;
            entrada = nuevo;
        }
    }
    public void ventaProducto(int cant)
    {
        Nodo actual = entrada;
        int nC;
        if(cant<salida.cant)
        {
            salida.cant-=cant;
            this.Mostrar();
        }
        else
        {
            nC = cant-salida.cant;
            if (entrada.sig!=null)
            {
            while (actual.sig!= salida)
            {
                actual = actual.sig;
            }
            salida = actual;
            salida.sig = null;
            this.ventaProducto(nC);
            }
            else
            {   
                entrada = null;
                salida = null;
                this.Mostrar();
                if (nC !=0)
                {
                    System.out.println("FALTAN: "+nC);
                }
                
            }
        }
    }
    public void Mostrar()
    {
        Nodo actual = entrada;
        if (entrada !=null)
        {
            while(actual != null)
            {
                actual.Mostrar();
                actual= actual.sig;
            }
        }
        else
        {
            System.out.println("SIN PRODUCTOS");
        }
    }
}
