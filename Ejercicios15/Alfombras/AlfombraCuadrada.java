/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alfombra;
/**
 *
 * @author Karen
 */
ublic class AlfombraCuadrada extends Alfombra {
  private int lado;

  public AlfombraCuadrada(String color, int precioMetro, int lado) {
      super(color, precioMetro);
      this.lado = lado;
  }

  public int getLado() {
      return lado;
  }

  public void setLado(int lado) {
      this.lado = lado;
  }

  @Override
  public double calcularSuperficie() {
      return Math.pow(lado, 2);
  }

  @Override
  public double calcularPrecio() {
      return calcularSuperficie() * getPrecioMetro();
  }
}
