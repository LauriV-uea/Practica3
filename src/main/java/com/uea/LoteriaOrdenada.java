//Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva,
//los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.

package com.uea;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class LoteriaOrdenada {
    private List<Integer> numerosGanadores;    // lista de números 
    
    public LoteriaOrdenada()  {
        numerosGanadores = new ArrayList<>();
        
    }
    public void leerNumeros()  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los 6 números ganadores: ");
        for (int i = 0; i < 6; i++)  {
            System.out.print("Número" + (i+i) + ":");
            int numero = sc.nextInt ();
            numerosGanadores.add(numero);
        }

    }
    
    public void mostrarOrdenados() {
        Collections.sort(numerosGanadores);     //ordenamos de menor a mayor
        System.out.println("Números ganadores ordenados: ");
        for (int numero : numerosGanadores) {
            System.out.print(numero + "");
        }
        
        
        System.out.println();
    }
    
    public static void main (String[] args)   {
        LoteriaOrdenada programa = new LoteriaOrdenada();
        programa.leerNumeros();
        programa.mostrarOrdenados();
        
    }
}




    

   
  
