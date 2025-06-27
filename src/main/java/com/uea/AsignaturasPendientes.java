//Escribir un programa que almacene las asignaturas de un curso
//(por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista,
//pregunte al usuario la nota que ha sacado en cada asignatura 
//y elimine de la lista las asignaturas aprobadas. 
//Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir.


package com.uea;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;   //para eliminar mientras recorremos
import java.util.Scanner;

public class AsignaturasPendientes {
    private final List<String> asignaturas;
    
    public AsignaturasPendientes() {
        asignaturas = new ArrayList<>();
        asignaturas.add(" Matemáticas");
        asignaturas.add(" Ciencias");
        asignaturas.add(" Historia");
        asignaturas.add(" Química");
        asignaturas.add(" Estadística");
        
    }
    
    public void eliminarAprobadas() {
        Scanner sc = new Scanner(System.in);
        
        //usamos el iterador para recorrer mientras eliminamos
        Iterator<String> it = asignaturas.iterator();
        while (it.hasNext()) {
            String asignatura = it.next();
            System.out.print("¿Que nota has sacado en " + asignatura + "?");
            double nota = sc.nextDouble();
            if (nota >=7) {
                it.remove();       //si se aprobó la eliminamos
            }
        }
    }

    public void mostrarPendientes()  {
        System.out.println(" Tienes que repetir las siguientes asignaturas: ");
        for (String asignatura : asignaturas)  {
            System.out.println(asignatura);
        }
    }


    public static void main (String[] args)    {
        AsignaturasPendientes programa = new AsignaturasPendientes();
        programa.eliminarAprobadas();
        programa.mostrarPendientes();   
    }
}
  
    

    

   
