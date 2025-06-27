//Escribir un programa que almacene las asignaturas de un curso 
//(por ejemplo Matemáticas, Física, Química, Historia y Lengua) 
//en una lista y la muestre por pantalla el mensaje Yo estudio <asignatura>, 
//donde <asignatura> es cada una de las asignaturas de la lista.


package com.uea;

import java.util.ArrayList;
import java.util.List;

public class AsignaturasEstudio {        //lista que contendrá todas las asignaturas
    private final List<String> asignaturas;
    
    //constructor para inicializar la lista
    public AsignaturasEstudio() {     
        asignaturas = new ArrayList<>();

      //añadimos las asignaturas
        asignaturas.add(" Estadistica");
        asignaturas.add(" Matematica");
        asignaturas.add(" Fisica");
        asignaturas.add(" Economía");
        asignaturas.add(" Historia");

    }

    //método para mostrar un mensaje por cada asignatura
    public void mostrarAsignaturas() {
        for (String asignatura : asignaturas) { 
            System.out.println(" yo estudio " + asignatura);
        }
    }
    
    // método principal
    public static void main(String[] args) {
        AsignaturasEstudio programa = new AsignaturasEstudio();
        programa.mostrarAsignaturas();
    }
   
}







       

    

    
