/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Universidad {
      //Atributos
   private String Identificacion;
   private String Nombre;
   private ArrayList<Estudiante> IsEstudiantes;//Aqui se realiza la asociacion

    public Universidad() {
    }

    public Universidad(String Identificacion, String Nombre, ArrayList<Estudiante> IsEstudiantes) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
        this.IsEstudiantes = IsEstudiantes;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Estudiante> getIsEstudiantes() {
        return IsEstudiantes;
    }

    public void setIsEstudiantes(ArrayList<Estudiante> IsEstudiantes) {
        this.IsEstudiantes = IsEstudiantes;
    }
   
   
}
