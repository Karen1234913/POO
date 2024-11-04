/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProfesorEmeritos;
/**
 *
 * @author Karen
 */
public class Profesor {
  private String nombre;
  private int edad;
  private int añosConsolidados;

  public Profesor(String nombre, int edad, int añosConsolidados) {
    this.nombre = nombre;
    this.edad = edad;
    this.añosConsolidados = añosConsolidados;
  }  

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public int getAñosConsolidados() {
    return añosConsolidados;
  }
}


