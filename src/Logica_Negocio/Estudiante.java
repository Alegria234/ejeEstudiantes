/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author LENOVO
 */
public class Estudiante {
     //Atributos
    private String Identificacion;
    private String Nombre;
    //Construtor no parametrizado

    public Estudiante() {
    }
    //Construtor parametrizado

    public Estudiante(String Identificacion, String Nombre) {
        this.Identificacion = Identificacion;
        this.Nombre = Nombre;
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
    
}
