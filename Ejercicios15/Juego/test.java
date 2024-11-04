/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karen
 */
package Juego;

public class test {
  
public static void main(String[] args) {
  
  Juego juego= new Juego(6);

  while ( !juego.finJuego() ) {
      juego.ronda();
  }
  
    System.out.println(" El juego ha terminado");
}


}
