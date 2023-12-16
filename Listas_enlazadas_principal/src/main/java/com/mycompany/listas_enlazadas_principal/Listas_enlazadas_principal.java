/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listas_enlazadas_principal;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class Listas_enlazadas_principal {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        LEnlazada lista = new LEnlazada();
        while(true)
        {
            System.out.println("OPCIONES");
            System.out.println("1. Agregar Incio");
            System.out.println("2. Agregar Final");
            System.out.println("3. Mostrar");
            System.out.println("4. Eliminar Inicio");
            System.out.println("5. Eliminar Final");
            int a = leer.nextInt();
            switch(a)
            {
                case 1: lista.agregarInicio();
                break;
                case 2: lista.agregarFinal();
                break;
                case 3: lista.recorrer();
                break;
                case 4: lista.eliminarInicio();
                break;
                case 5: lista.eliminarFinal();
                break;
                default: System.out.println("Ingrese un dato correcto");
            }
        }
    }
}
