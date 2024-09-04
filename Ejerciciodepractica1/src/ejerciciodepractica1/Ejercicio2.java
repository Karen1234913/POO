/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciodepractica1;
import java.util.Scanner;
/**
 *
 * @author Karen Ximena Cruz Guzman 20241220955
 */
/*Ejercicio 2*/
/*En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste
en lo siguiente:
• Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se
compran de cinco a 10 y de U$50 si se compran más de 10.
• Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas
que compra y la que tiene que pagar por el total de la compra.*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese la cantidad de llantas que compro: ");
        cantidad = input.nextInt();
        if (cantidad < 5) {
            double precio1= (cantidad*100);
            System.out.println("La cantidad de dinero que tiene que pagar por su cantidad de llanta es de $100");
            System.out.println("El precio que debe pagar en total es : "+precio1);
        }
        else if (cantidad >=5 && cantidad < 10) {
            double precio2= (cantidad*75);
            System.out.println("La cantidad de dinero que tiene que pagar por su cantidad de llanta es de $75");
            System.out.println("El precio que debe pagar en total es : "+precio2);
        }
        else if (cantidad >=10) {
            double precio3= (cantidad*50);
            System.out.println("La cantidad de dinero que tiene que pagar por su cantidad de llanta es de $50");
            System.out.println("El precio que debe pagar en total es : "+precio3);
        }
    }
}
