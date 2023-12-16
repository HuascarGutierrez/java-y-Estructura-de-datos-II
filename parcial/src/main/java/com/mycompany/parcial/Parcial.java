/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class Parcial {

    public static void main(String[] args) {
           int n;
        ListaCursos carreraSistemas = new ListaCursos();
        while(true)
        {
            System.out.println("\tOPCIONES");
        System.out.println("1. Agregar curso\n2. Mostrar Cursos\n");
        Scanner leer= new Scanner(System.in);
        n=leer.nextInt();
        switch(n)
        {
            case 1: 
                carreraSistemas.agregoCurso();
            break;
            case 2: 
                carreraSistemas.mostrar();
            break;
        }
        }
    }
    }
