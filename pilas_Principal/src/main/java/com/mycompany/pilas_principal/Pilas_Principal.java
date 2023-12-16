/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilas_principal;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class Pilas_Principal {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Pila lista = new Pila();
        String b;
        while(true)
        {
            lista.cant=0;
            System.out.println("\tOPCIONES");
            System.out.println("1. Primer pila (de derecha a izquierda)");
            System.out.println("2. Segunda pila (de izquierda a derecha)");
            int a = leer.nextInt();
            int x;
            boolean verificar = true;
            switch(a)
            {   
                case 1:while (verificar)
                {
                        System.out.println("OPCIONES");
                        System.out.println("1. push");
                        System.out.println("2. pop");
                        System.out.println("3. mostrar");
                        System.out.println("4. buscar");
                        System.out.println("5. buscar posiciones");
                        System.out.println("6. salir");
                        x= leer.nextInt();
                        switch(x)
                        {
                            case 1: 
                                System.out.println("Ingrese el dato:");
                                b=leer.nextLine();
                                b=leer.nextLine();
                                lista.push_A(b); 
                            break;
                            case 2: lista.pop_A();
                            break;
                            case 3: lista.recorrer();
                            break;
                            case 4: System.out.println("Ingrese el dato a buscar: ");
                                b=leer.nextLine();
                                b=leer.nextLine();
                                lista.buscar_A(b);
                            break;
                            case 5: System.out.println("Ingrese el dato a buscar: ");
                                b=leer.nextLine();
                                b=leer.nextLine();
                                lista.buscar_B(b);
                            break;
                            case 6: verificar=false;
                            break;
                            default: System.out.println("Ingrese un dato correcto");
                        }
                }
                case 2:while (verificar)
                {
                        System.out.println("OPCIONES");
                        System.out.println("1. push");
                        System.out.println("2. pop");
                        System.out.println("3. mostrar");
                        System.out.println("4. salir");
                        x= leer.nextInt();
                        switch(x)
                        {
                            case 1: System.out.println("Ingrese el dato: ");
                                b=leer.nextLine();
                                b=leer.nextLine();
                                lista.push_B(b);
                            break;
                            case 2: lista.pop_B();
                            break;
                            case 3: lista.recorrer();
                            break;
                            case 4: verificar=false;
                            break;
                            default: System.out.println("Ingrese un dato correcto");
                        }
                }  
                default: System.out.println("Ingrese un dato correcto");
            }
        }
        
    }
}
