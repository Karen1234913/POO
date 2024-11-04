/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karen
 */
package Juego;

public class Metodos {
  

public static int generaNumeroAleatorio(int minimo, int maximo){
  int num=(int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
  return num;
}

}
