/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repaso2doparcial;
import java.util.Scanner;
/**
 *
 * @author huasc
 */
    public class Nodo {
        int nLote;
        int cant;
        String fecha;
        Nodo sig;
        Scanner leer = new Scanner(System.in);
        public Nodo ()
        {
            System.out.println("Ingrese el nLote");
            nLote = leer.nextInt();
            System.out.println("Ingrese la cantidad");
            cant = leer.nextInt();
            System.out.println("Ingrese la fecha");
            leer.skip("\n");
            fecha = leer.nextLine();
            sig = null;
        }
        public void Mostrar()
        {
            System.out.println("____________________________");
            System.out.println("nLote: "+nLote);
            System.out.println("cantidad: "+cant);
            System.out.println("fecha: "+fecha);
            System.out.println("sig: "+sig);
            System.out.println("____________________________");
        }
    }
