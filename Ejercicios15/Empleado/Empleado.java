/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author Karen
 */

    public class Empleado {
    // Atributos privados
    private String nombre;
    private String telefono;
    private static int numeroEmpleados = 0; // Atributo estático para contar empleados

    // Constructor parametrizado

    public Empleado(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        numeroEmpleados++; // Incrementar el contador al crear un nuevo empleado
    }

    public Empleado() {
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public static void setNumeroEmpleados(int numeroEmpleados) {
        Empleado.numeroEmpleados = numeroEmpleados;
    }

    // toString para imprimir información del empleado
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Teléfono: " + telefono;
    }
}

