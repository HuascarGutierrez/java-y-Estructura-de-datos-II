/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilas_principal;

import java.util.Scanner;

public class Pila {
    Scanner leer = new Scanner(System.in);
    Nodo inicio;
    int cant;
    Nodo cima;
    //String [] vector;
    //int total_V;
    //Nodo fin;
    
    public Pila()
    {
        inicio=null;
        cant=0;
        cima=null;
        //vector= new String[10];
        //total_V=10;
    //    fin=null;
    }
    public void push_A(String x)
    {
        Nodo nuevo = new Nodo(x);
        cant++;
        if(cant==1)
        {
            inicio=nuevo;
            cima=nuevo;
        //    fin=nuevo;
        }

        else 
        {           
            nuevo.siguiente=cima;
            cima=nuevo;
            inicio=nuevo;
        }
    }
    
    public void pop_A()
    {
        if(cant==0)
        {
            System.out.println("Primero ingrese un dato\n");
        }
        else
        {
            cima=cima.siguiente;
            inicio=inicio.siguiente;
            cant-=1;
        }
    }
    
    public void push_B(String x)
    {
        Nodo nuevo = new Nodo(x);
        cant++;
        if(cant==1)
        {
            cima=nuevo;
            inicio=nuevo;
        //    fin=nuevo;
        }
        else 
        {
        //    fin.siguiente=nuevo;
        //    fin=nuevo;
            cima.siguiente=nuevo;
            cima=cima.siguiente;
        }
    }
    
    public void pop_B()
    {
        if(cant==0)
        {
            System.out.println("Primero ingrese un dato\n");
        }
        else
        {
            Nodo busqueda = inicio;
            for(int i=1;i<cant-1;i++)
            {
                busqueda=busqueda.siguiente;
            }
        cima=busqueda;
        cima.siguiente=null;
            cant-=1;
        }
    }
    
    /*public void push_C()
    {
        cant++;
        if(cant<=10)
        {
            String dato_I=leer.nextLine();
            System.out.println("Ingrese el dato:");
            vector[total_V-cant]=dato_I;
        }
        else
        {
            System.out.println("El vector ya esta lleno");
        }
    }
    
    public void pop_C()
    {
        if(cant==0)
        {
            System.out.println("Primero ingrese un dato\n");
        }
        else
        {
            vector[total_V-cant]=null;
            cant-=1;
        }
    }*/
    
    public void recorrer()
    {
        Nodo actual=inicio;
        if (cant!=0)
        {
            
            //System.out.println(cima.dato);
                    //    System.out.println(fin.dato);
            //System.out.println("");

            System.out.println("Aqui esta la lista: ");
            while(actual!=null)
            {
                actual.mostrar();
                actual=actual.siguiente;
            } 
        }
        else
        {
            System.out.println("No presenta ningun dato en la lista");
        }
    }
    public void buscar_A(String x)
    {        
        Nodo busqueda=cima;
        Pila nuevo=new Pila();
        while(busqueda!=null && !busqueda.dato.equalsIgnoreCase(x))
        {
            nuevo.push_A(busqueda.dato);
            busqueda=busqueda.siguiente;
        }
        nuevo.recorrer();        
                Pila indicio= new Pila();
        Nodo punt=nuevo.cima;
        while(punt!=null)
        {
            indicio.push_A(punt.dato);
            punt=punt.siguiente;
        }
        
        Nodo muestra=cima;
        int total = cant-nuevo.cant;
        System.out.println("\nLa cantidad restante es: "+total);

        System.out.println("Pila restante");
        Nodo m = indicio.cima;
        while(m!=null)
        {
            if(muestra.dato.equalsIgnoreCase(m.dato))
            {
                m=m.siguiente;
            }
            muestra=muestra.siguiente;
        }
        while(muestra!=null)
        {
            muestra.mostrar();
            muestra=muestra.siguiente;
        }
        
        if (nuevo.cant==cant)
        {
            System.out.println("No existe en la pila");
        }
    }
   public void buscar_B(String x)
    {
        int cont=1;
        Nodo busqueda=cima;
        Pila nuevo=new Pila();
        while(busqueda!=null)
        {
            if(busqueda.dato.equalsIgnoreCase(x))
            {
                System.out.println("Se encuentra en el puesto "+cont);
            }
            busqueda=busqueda.siguiente;
            cont++;
        }
        if(cont==cant+1)
            System.out.println("No se encuentra en la pila"); 
    }
/*    public void recorrer_C()
    {
        if (cant!=0)
        {
            int i;
            System.out.println("Aqui esta la lista");
            System.out.print("[");
            for(i=0;i<total_V-1;i++)
            {
                System.out.print(vector[i]+",");
            }
            System.out.print(vector[i]+"]\n");
        }
        else
        {
            System.out.println("No presenta ningun dato en la lista");
        }
    }*/
}
