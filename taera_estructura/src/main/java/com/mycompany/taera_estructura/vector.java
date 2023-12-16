/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taera_estructura;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class vector {
    int tamano;
    int [] v={};
    Scanner leer=new Scanner(System.in);


    public vector(int tamano) {
        this.tamano = tamano;
        this.v=new int[tamano];
    }
    
        public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int[] getV() {
        return v;
    }
    public int getV_i(int i) {
        return v[i];
    }

    public void setV(int x,int i) {
        this.v[i] = x;
    }
    
    public void tamano(int tamano)
    {
        this.setTamano(tamano);
    }
    public void llenar()
    {
        for (int i=0;i<this.tamano;i++)
        {
            int x=leer.nextInt();
            this.setV(x,i);
        }
    }
    public void mostrar()
    {
        for (int i=0;i<this.getTamano();i++)
        {
            System.out.println("v["+i+"] : "+v[i]);
        } 
    }
    public void sumaV(vector vector_1,vector vector_2)
    {   //int [] suma={};
        for (int i=0;i<this.getTamano();i++)
        {   this.setV(vector_1.getV_i(i)+vector_2.getV_i(i),i);
            System.out.println("s["+i+"] : "+this.v[i]);
        } 
    }
    public void mostrar_especifico()
    {
        System.out.println("Ingrese la posicion");
        int x=leer.nextInt();
        System.out.println("el valor en la posicion "+x+" es: "+this.v[x]);
    }    
}
