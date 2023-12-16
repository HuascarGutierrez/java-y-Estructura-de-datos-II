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
public class ListaCursos {
        Curso l1;
    String nCarrera;
    int total;
    Scanner leer= new Scanner(System.in);
    ListaCursos()
    {
        l1=null;
        total=0;
        System.out.println("Ingrese el nombre de las lista de cursos");
        nCarrera=leer.nextLine();
    }
    public void agregoCurso()
    {
        Curso nuevo =new Curso();
        if(total == 0)
        {
            l1 = nuevo;
        }   
        else
        {
            Curso actual = l1;
            while(actual.siguiente!=null)
            {
                actual=actual.siguiente;
            }
            actual.siguiente=nuevo;
        }
        total++;
    }
    void mostrar()
    {   System.out.println("Cursos de la lista: "+nCarrera);
        Curso actual=l1;
        while(actual!=null)
        {   actual.mostrar();
            actual=actual.siguiente;
        }
    }
}
