/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resolucion_examen;

/**
 *
 * @author huasc
 */
public class Resolucion_examen {

    public static void main(String[] args) {
        //pregunta 1
        int var;
        double var2;
        float [] var3;
        Estudiante punt;
        //pregunta 2
        var = 3;
        var2 = 2.54;
        var3 = new float[50];
        punt = new Estudiante();
        //pregunta 3
        
        Nodo inicio;
        
        Nodo nuevo = new Nodo(); // paso 1 
        Nodo actual;
        actual = inicio;  //paso 2
        actual=actual.siguiente; //paso 3
        actual=actual.siguiente; //paso 4
        actual=actual.siguiente; //paso 5
        actual=actual.siguiente; //paso 6
        actual.siguiente = nuevo;
            }
}
