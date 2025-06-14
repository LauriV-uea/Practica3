
package Datos_estudiante;

import Tarea3.Estudiante;


public class Informacion  {
    public static void main(String[]args) {
        
        
        // crear arreglos de telefonos
        String[] telefonos = {"0976854673", "0989872343", "0965456453"};

//Crear objeto estudiante usando el construstor
        Estudiante estudiante = new Estudiante(
            1, "Pedro", "Mendez", "Guayaquil", telefonos);

     //Mostrar información dele studiante 
        estudiante.mostrarInformacion();
    }
    
}





