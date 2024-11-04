/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;
import java.util.Scanner;
/**
 *
 * @author Karen
 */
public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[4]; // array de 4 empleados

        // Leer datos de cada empleado

        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el teléfono del empleado " + (i + 1) + ":");
            String telefono = scanner.nextLine();
            empleados[i] = new Empleado(nombre, telefono); // Crear un nuevo empleado
        }

        // Mostrar los datos de cada empleado

        System.out.println("\nDatos de los empleados:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }

        // Mostrar el número de empleados instanciados

        System.out.println("Número de empleados instanciados: " + Empleado.getNumeroEmpleados());

        scanner.close();
    }
}