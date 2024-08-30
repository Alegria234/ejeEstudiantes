/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helper.HelperValidacion;
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
        int num_Es, rta, conteo;
        String identificacion, nombre, id_uni;
        ArrayList<Estudiante> lsEstudiantes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite el numero de estudiantes");
        num_Es = scan.nextInt();

        scan.nextLine();

        for (int i = 0; i < num_Es; i++) {

            System.out.println("Digite el nombre del estudiante");
            nombre = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre);

            while (rta > 0) {
                System.out.println("Digite el nombre del estudiante");
                nombre = scan.nextLine();
                rta = HelperValidacion.ValidarVacio(nombre);
            }
            conteo = HelperValidacion.ValidarTodo(nombre);

            while (conteo != 0) {
                System.out.println("Digite el nombre del estudiante");
                nombre = scan.nextLine();
                conteo = HelperValidacion.ValidarTodo(nombre);
            }
            System.out.println("Digite la identificacion del estudiante");
            identificacion = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(identificacion);

            while (rta > 0) {
                System.out.println("Digite la identificacion del estudiante");
                identificacion = scan.nextLine();
                rta = HelperValidacion.ValidarVacio(identificacion);
            }
            conteo = HelperValidacion.ValidarTodoLetra(identificacion);

            while (conteo != 0) {
                System.out.println("Digite la identificacion del estudiante");
                identificacion = scan.nextLine();
                conteo = HelperValidacion.ValidarTodoLetra(identificacion);
            }

            Estudiante objEstudiante = new Estudiante(identificacion, nombre);
            lsEstudiantes.add(objEstudiante);
        }
        System.out.println("Nombre de la universidad");
        nombre = scan.nextLine();
        rta = HelperValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.println("Digite el nombre de la universidad");
            nombre = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(nombre);
        }
        conteo = HelperValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.println("Digite el nombre de la universidad");
            nombre = scan.nextLine();
            conteo = HelperValidacion.ValidarTodo(nombre);
        }

        System.out.println("Id de la universidad");
        id_uni = scan.nextLine();
        rta = HelperValidacion.ValidarVacio(id_uni);

        while (rta > 0) {
            System.out.println("Id de la universidad");
            id_uni = scan.nextLine();
            rta = HelperValidacion.ValidarVacio(id_uni);
        }
        conteo = HelperValidacion.ValidarTodoLetra(id_uni);

        while (conteo != 0) {
            System.out.println("Id de la universidad");
            id_uni = scan.nextLine();
            conteo = HelperValidacion.ValidarTodoLetra(id_uni);
        }

        Universidad objUniversidad = new Universidad(id_uni, nombre, lsEstudiantes);

        System.out.println("El nombre de la universidad es:" + "\t" + objUniversidad.getNombre());
        System.out.println("La identificacion de la universidad es:" + "\t" + objUniversidad.getIdentificacion());

        for (int i = 0; i < objUniversidad.getIsEstudiantes().size(); i++) {
            System.out.println("El nombre del estudiante" + "\t" + objUniversidad.getIsEstudiantes().get(i).getNombre());
            System.out.println("La identificacion del estudiante" + "\t" + objUniversidad.getIsEstudiantes().get(i).getIdentificacion());

        }
    }

}
