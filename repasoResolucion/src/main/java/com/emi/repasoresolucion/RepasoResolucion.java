/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.emi.repasoresolucion;

/**
 *
 * @author huasc
 */
public class RepasoResolucion {

    public static void main(String[] args) {
        Pila curso = new Pila();
        curso.agregar("Condori Choquehuanca");
        curso.agregar("Sea Maldonado");
        curso.agregar("Villegas Salazar");
        System.out.println("Pila completa");
        curso.mostrar();
        System.out.println("Se saca el elemento");
        curso.sacar().mostrar();
        System.out.println("Pila con 1 elemento fuera");
        curso.mostrar();
    }
}
