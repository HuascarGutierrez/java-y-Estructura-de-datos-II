/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taera_estructura;

import java.util.Scanner;

/**
 *
 * @author huasc
 */
public class Tarea_estructura {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        while(true)
        {
            System.out.println("\tINICIO\nIngrese un tamano:\n");
            int size=leer.nextInt();
            vector v4;
            v4= new vector(size);//se puede realizr esto, se crea y luego se puede instanciar.
     // existe la declaracion y instansacion como los dos pasos
            vector v_1=new vector(size);
            vector v_2=new vector(size);
            vector v_3=new vector(size);
            System.out.println("El tamano es: "+size+"\n");
            boolean valor=true;
            while(valor)
            {
                System.out.print("\nOPCIONES\n1. Llenar\n2. Mostrar\n3.Suma\n4. Mostrar espedifico\n");
                int x=leer.nextInt();
                if(x==1)
                {   System.out.println("Ingrese los datos del vector Nro 1\n");
                    v_1.llenar();
                    System.out.println("\nIngrese los datos del vector Nro 2\n");
                    v_2.llenar();
                    System.out.println("\nIngrese los datos del vector Nro 3\n");
                    v_3.llenar();
                }
                else if (x==2)
                {
                    v_1.mostrar();
                }
                else if (x==3)
                {
                    v_1.sumaV(v_2,v_3);
                    System.out.println("\nAhora la suma se encuentra en el vector Nro 1\n");
                }
                else if (x==4)
                {
                    v_1.mostrar_especifico();
                }

            }
        }
        
        
    }
}
