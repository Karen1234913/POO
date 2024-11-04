/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karen
 */
package Juego;

public class Revolver {
  

  private int posicionBalaActual;
  private int posicionBala;

  public Revolver(){
      posicionBalaActual= Metodos.generaNumeroAleatorio(1, 6);
      posicionBala= Metodos.generaNumeroAleatorio(1, 6);
  }

  public boolean disparar(){

    boolean exito = false;

    if (posicionBalaActual == posicionBala) {
      exito = true;
    }

    siguienteBala();

    return exito;
  }


  public void siguienteBala(){

    if (posicionBalaActual == 6) {
      posicionBalaActual =1;

    } else{

      posicionBalaActual++;
    }

  }

    public String toString(){
      return "Posicion Bala Actual:"+posicionBalaActual+", Posicion bala: "+ posicionBala;

    }

}
