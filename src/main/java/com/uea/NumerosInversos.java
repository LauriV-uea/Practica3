//Escribir un programa que almacene en una lista los números del 1 al 10 
//y los muestre por pantalla en orden inverso separados por comas

package com.uea;

import java.util.ArrayList;
import java.util.List;


public class NumerosInversos {
    private List<Integer> numeros;
    
    public NumerosInversos()   {
        numeros = new ArrayList<>();
        
        //añadimos el número desde el 1 hasta 10
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
            
        }
    }
    
    public void mostrarInverso()  {
        System.out.print("Números en orden inverso: ");
        
        //recorremos desde el final 
        for (int i = numeros.size() -1;  i >= 0; i--)  {
            System.out.print(numeros.get(i));
            
            if (i != 0) {
                System.out.print(",");
   
            }
        }
        System.out.println();
}
    
    public static void main(String[] args)  {
        NumerosInversos programa = new NumerosInversos();
        programa.mostrarInverso();
        
        } 
}

    
