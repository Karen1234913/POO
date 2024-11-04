/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alfombra;
/**
 *
 * @author Karen
 */
public abstract class Alfombra  Importalfombras{
  private String color;
  private int precioMetro;

  public Alfombra(String color, int precioMetro) {
      this.color = color;
      this.precioMetro = precioMetro;
  }

  public String getColor() {
      return color;
  }

  public void setColor(String color) {
      this.color = color;
  }

  public int getPrecioMetro() {
      return precioMetro;
  }

  public void setPrecioMetro(int precioMetro) {
      this.precioMetro = precioMetro;
  }

  public abstract double calcularSuperficie();

  public abstract double calcularPrecio();
}

