/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class Curso {
    int n;
    String nombre;
    String [] lista;
    Curso siguiente;
    Scanner leer = new Scanner(System.in);
    Curso ()
    {
        System.out.println("Ingrese el nombre del curso");
        nombre = leer.nextLine();
        System.out.println("Ingrese el tamano del curso");
        n = leer.nextInt();
        System.out.println("Ingrese los nombres de los estudiantes");
        lista= new String [n];
        int i;
        lista[0]=leer.nextLine();
        for(i=0; i <n; i++)
        {
            lista[i] = leer.nextLine();
        }
        siguiente = null;
    }
    void mostrar()
    {
        int i;
        System.out.println("Curso: "+nombre);
        System.out.println("Asisten "+n+" estudiantes");
        for(i = 0; i<n; i++)
        {
            System.out.println((i+1)+": "+lista[i]);
        }
    }
}
