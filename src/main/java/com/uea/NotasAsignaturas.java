//Escribir un programa que almacene las asignaturas de un curso 
//(por ejemplo Matemáticas, Física, Química, Historia y Lengua)
//en una lista, pregunte al usuario la nota que ha sacado en cada asignatura, 
//y después las muestre por pantalla con el mensaje En <asignatura> has sacado <nota>
//donde <asignatura> es cada una des las asignaturas de la lista 
//y <nota> cada una de las correspondientes notas introducidas por el usuario.

package com.uea;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class NotasAsignaturas {
    private final List<String> asignaturas;   //lista de asignaturas
    private final List<Double>  notas;       //lista notas
    
    
    public NotasAsignaturas() {
        asignaturas = new ArrayList<>();
        notas = new ArrayList<>();

        //añadimos las asignaturas
        asignaturas.add (" Matematicas");
        asignaturas.add(" Física");
        asignaturas.add(" Quimica");
        asignaturas.add(" Historia");
        asignaturas.add(" Lengua");
        
    }
    

    public void pedirNotas() {
        Scanner sc = new Scanner(System.in);
        
        //para cada asignatura, pedimos la nota
        for (String asignatura : asignaturas) {
            System.out.print (" ¿Qué nota has sacado en " + asignatura + "?");
            double nota = sc.nextDouble();
            notas.add(nota);     // guardamos la nota en la lista
        }
    }

    public void mostrarResultados() {
        // mostramos cada asignatura con su nota correspondiente
        for (int i = 0; i < asignaturas.size(); i++ ) {
            System.out.println (" En " + asignaturas.get(i) + " has sacado" + notas.get(i));
        }
    }

    public static void main (String[] args) {
        NotasAsignaturas programa = new NotasAsignaturas();
        programa.pedirNotas();
        programa.mostrarResultados();
    }
}

   
    








    
    


  

    