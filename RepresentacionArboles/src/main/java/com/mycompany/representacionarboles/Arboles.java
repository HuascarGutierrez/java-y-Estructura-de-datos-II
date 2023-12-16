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
public class Arboles {
    Nodo raiz;
    Nodo indice;
    int cont;
    Scanner leer = new Scanner(System.in);
    public Arboles()
    {
        indice = null;
        raiz = null;
        cont = 0;
    }
    public void agregar()
    {
        System.out.println("Ingrese dato: ");
        int a = leer.nextInt();
        Nodo nuevo = new Nodo(a);
        if(raiz == null)
        {
            indice = nuevo;
            raiz = nuevo;
        }
        else
        {
            indice.sig = nuevo;
            indice = indice.sig;
        }
        cont++;
    } 
    public void agregar(int a)
    {
        Nodo nuevo = new Nodo(a);
        if(raiz == null)
        {
            indice = nuevo;
            raiz = nuevo;
        }
        else
        {
            indice.sig = nuevo;
            indice = indice.sig;
        }
    }  
    public void mostrar()
    {
        Nodo actual = raiz;
        while(actual != null)
        {
            actual.mostrar();
            actual = actual.sig;
        }
    }
    
    public void representarMatriz()
    {
        int aux=1;
        String[][] matriz = new String[cont][cont];
        for(int o=0; o<cont; o++)
        {
            for (int j=0; j<cont; j++)
            {
                matriz[o][j]="M";
            }
        }
        
        for(int z=0; z<cont; z++)
        {
            for (int j=0; j<cont; j++)
            {
                if(z==j)
                {
                    matriz[z][j] = "0";
                }
                else if (j == aux || j==aux+1)
                        {
                            matriz[z][j]="1";
                            matriz[j][z]="1";
                        }
                
            }
            aux+=2;
        }    
        System.out.println("REPRESENTACION MATRICIAL");
        
        Nodo muestra = raiz;
        System.out.print(" ");
        while(muestra!=null)
        {
            System.out.print(String.format("%3s",muestra.dato));
            muestra = muestra.sig;
        }
        System.out.print("\n");
        
        muestra = raiz;
        for(int i=0; i<cont; i++)
        {   
            System.out.print(muestra.dato + ": ");
            for (int j=0; j<cont; j++)
            {
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.print("\n");
            muestra = muestra.sig;
        }
    }
    
    public void representarListas()
    {
        int aux=1;
        String[][] matriz = new String[cont][cont];
        for(int o=0; o<cont; o++)
        {
            for (int j=0; j<cont; j++)
            {
                matriz[o][j]="M";
            }
        }
        
        for(int z=0; z<cont; z++)
        {
            for (int j=0; j<cont; j++)
            {
                if(z==j)
                {
                    matriz[z][j] = "0";
                }
                else if (j == aux || j==aux+1)
                        {
                            matriz[z][j]="1";
                            matriz[j][z]="1";
                        }                
            }
            aux+=2;
        }
        
        System.out.println("REPRESENTACION CON LISTAS ENLAZADAS");
        
        Nodo nombre = raiz;
        for(int z=0; z<cont; z++)
        {
            vector lista = new vector();
                System.out.print(String.format(nombre.dato + ": "));
            for (int j=0; j<cont; j++)
            {
                if(matriz[z][j].equals("1"))
                {
                    Nodo pos = raiz;
                    
                    for(int x=0;x<j;x++)
                    {
                        pos = pos.sig;
                    }
                    lista.agregar(pos.dato);
                }                
            }
            nombre = nombre.sig;
            lista.mostrar();
        }
    }
    public void buscar(int y)
    {
        int aux=1;
        String[][] matriz = new String[cont][cont];
        for(int o=0; o<cont; o++)
        {
            for (int j=0; j<cont; j++)
            {
                matriz[o][j]="M";
            }
        }
        
        for(int z=0; z<cont; z++)
        {
            for (int j=0; j<cont; j++)
            {
                if(z==j)
                {
                    matriz[z][j] = "0";
                }
                else if (j == aux || j==aux+1)
                        {
                            matriz[z][j]="1";
                            matriz[j][z]="1";
                        }                
            }
            aux+=2;
        }
        
        
        int conteo =0;
        Nodo refe = raiz;
        while(refe.dato != y && refe!=null)
        {
            refe = refe.sig;
            conteo++;
        }
        System.out.println("cont: "+conteo);

        int ji,contador;
        Pila contenedor = new Pila();
        Pila noVistos = new Pila();
        
        for(int z=0; z<cont; z++)
        {
            contador = 0;
            for (ji=0; ji<cont; ji++)
            {
                if(matriz[z][ji].equals("1"))
                {
                    contador++;
                }
            }
            if(contador == 1)
            {
                matriz[z][ji-1] = "M";
                Nodo ref = raiz;
                for(int a=0;a<z;a++)
                {
                    ref= ref.sig;
                }
                contenedor.agregar(ref.dato);
            }
        }
        
        
        Nodo rep = contenedor.cima;
        while(rep!=null)
        {
            noVistos.agregar(rep.dato);
            rep = rep.sig;
            contenedor.sacar();
        }
            

        Pila vistos = new Pila();
        while(y>noVistos.cima.dato)
        {
            vistos.agregar(noVistos.cima.dato);
            noVistos.sacar();
        }
        System.out.println("Pila vistos");
        vistos.mostrar();
        System.out.println("Pila no vistos");
        noVistos.mostrar();
    }    
}
