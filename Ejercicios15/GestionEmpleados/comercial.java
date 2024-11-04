/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karen
 */
package GestionEmpleados;

public class comercial extends Empleado {
  
  private double comision;

  public comercial(String nombre, int edad, double salario, double comision) {
    super(nombre, edad, salario);
    this.comision = comision;
  }

  
  public double getComision() {
    return comision;
  }

  public void setComision(double comision) {
    this.comision = comision;
  }


  
  @Override
  public String toString() {
    return super.toString()+"comision=" + comision;
  }


  @Override
  public boolean plus() {

    if (super.getEdad()>30 &&  this.comision>200) {
      double nuevoSalario=super.getSalario() + super.PLUS;
        super.setSalario(nuevoSalario);
        System.out.println("Se a añadido el plus, al empleado" + super.getNombre());
        return true;
    }
    return false;
   }

}
