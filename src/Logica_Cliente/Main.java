/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Estudiante;
import Logica_Negocio.Universidad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num_Es;
        String identificacion, nombre;
        ArrayList<Estudiante> lsEstudiantes= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
       
       
        System.out.println("Digite el numero de estudiantes");
        num_Es=scan.nextInt();
        
        for (int i = 0; i < num_Es; i++) {
            
            System.out.println("Digite el nombre del estudiante");
            nombre=scan.next();
           
            System.out.println("Digite la identificacion del estudiante");
            identificacion= scan.next();
           
            Estudiante objEstudiante= new Estudiante(nombre, identificacion);
            lsEstudiantes.add(objEstudiante); 
        }
        System.out.println("Nombre de la universidad");
        nombre=scan.next();
        
        System.out.println("Id de la universidad");
        identificacion = scan.next();
        
        Universidad objUniversidad= new Universidad (nombre, identificacion, lsEstudiantes);
       
        System.out.println("El nombre de la universidad es:"+"\t"+objUniversidad.getNombre());
        System.out.println("La identificacion de la persona es:"+"\t"+objUniversidad.getIdentificacion());
        
        for (int i = 0; i<objUniversidad.getIsEstudiantes().size(); i++) {
            System.out.println("El nombre del estudiante"+"\t"+objUniversidad.getIsEstudiantes().get(i).getNombre());
            System.out.println("La identificacion del estudiante"+"\t"+objUniversidad.getIsEstudiantes().get(i).getIdentificacion());
            
        }
    }

   
}
