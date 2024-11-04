/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package profesorEmeritos;
/**
 *
 * @author Karen
 */
public class Prueba {
  public static void main(String[] args) {
    
    ProfesorEmerito profesor = new ProfesorEmerito("Dr. Juan Pérez", 65, 30, 5);

    
    System.out.println("Nombre: " + profesor.getNombre());
    System.out.println("Edad: " + profesor.getEdad());
    System.out.println("Años Consolidados: " + profesor.getAñosConsolidados());
    System.out.println("Años como Emérito: " + profesor.getAñosEmerito());

    
    double salarioBase = profesor.obtenerSalarioBase();
    System.out.println("Salario Base:"+ salarioBase);
  }
}