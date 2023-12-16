/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listas_enlazadas_principal;

/**
 *
 * @author huasc
 */
public class LEnlazada {
    
    //Nodo l1;
    int cant;
    Nodo inicio;
    Nodo fin;
    
    public LEnlazada()
    {
        //l1=null;
        cant=0;
        inicio=null;
        fin=null;
    }
    public void agregarInicio()
    {
        Nodo nuevo = new Nodo();
        cant++;
        if(inicio==null)
        {
            inicio=nuevo;
            fin=nuevo;
        }

        else 
        {           
            nuevo.siguiente=inicio;
            inicio=nuevo;
        }
    }
    
    public void agregarFinal()
    {
        Nodo nuevo = new Nodo();
        cant++;
        if(inicio==null)
        {
            inicio=nuevo;
            fin=nuevo;
        }
        else 
        {
            fin.siguiente=nuevo;
            fin=nuevo;
        }
    }
    public void recorrer()
    {
        Nodo actual=inicio;
        if (cant!=0)
        {
            
            System.out.println(inicio.dato);
                        System.out.println(fin.dato);
            System.out.println("");

            System.out.println("Aqui esta la lista: ");
            while(actual!=null)
            {
                actual.mostrar(1);
                actual=actual.siguiente;
            } 
        }
        else
        {
            System.out.println("No presenta ningun dato en la lista");
        }
    }
    public void eliminarInicio()
    {
        if(cant==0)
        {
            System.out.println("Primero ingrese un dato\n");
        }
        else
        {
            inicio=inicio.siguiente;
            cant-=1;
        }
    }
    public void eliminarFinal()
    {
        if(cant==0)
        {
            System.out.println("Primero ingrese un dato\n");
        }
        else
        {
            Nodo search = inicio;
            for(int i=1;i<cant-1;i++)
            {
                search=search.siguiente;
            }
            fin=search;
            fin.siguiente=null;
            cant-=1;
        }
    }
}
