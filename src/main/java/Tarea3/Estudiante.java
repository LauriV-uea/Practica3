
package Tarea3;


public class Estudiante {
    private int id;               //Id del estudiante
    private String nombres;       //nombres del estudiante
    private String apellidos;     //apellidos de estudiante
    private String direccion;     // dirección del estudiante
    private String[] telefonos;   // telefonos del estudiante
    
    //constructor que inicializa todos los atributos del estudiante
    public Estudiante(int id, String nombres, String apellidos, String direccion, String[] telefonos){
        this.id = id;                    //asignación del Id
        this.nombres = nombres;          //asignación de nombres
        this.apellidos = apellidos;      //asignación apellidos
        this.direccion = direccion;      //asignación de dirección
        this.telefonos = telefonos;     //asignación de telefonos 
    }
     
    //método para mostrar la información del estudiante en consola 
    public void mostrarInformacion() {
        System.out.println("ID:" + id);
        System.out.println("Nombres:" + nombres);
        System.out.println("Apellidos:" + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfonos:");
                for(String telefono: telefonos) {
                    System.out.println("-" + telefono);
                    
         }
    }
    
}
