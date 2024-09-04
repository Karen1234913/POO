/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciodepractica1;
import java.util.Scanner;
/*
 * @author Karen Ximena Cruz Guzman 20241220955
 */
/*Ejercicio 1*/
/*En una tienda de computadoras se planea ofrecer a los clientes un descuento que dependerá
del número de equipos que compre. Si las computadoras son menos de cinco se les dará un
10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual
a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un
40% de descuento. El precio de cada computadora es de U$500.*/

public class Ejerciciodepractica1 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int cantidad;
        System.out.println("Ingrese la cantidad de computadores que compro : ");
        cantidad =input.nextInt();
        if (cantidad < 5) {
            double por1 = (cantidad*500)*0.10;
            double precio1 = (cantidad*500) - por1;
            System.out.println("La cantidad que debe pagar es :"+precio1);
        }
        else if (cantidad >= 5 && cantidad < 10) {
            double por2 = (cantidad*500)*0.20;
             double precio2 = (cantidad*500) - por2;
            System.out.println("La cantidad que debe pagar es :"+precio2);
        }
        else if (cantidad >= 10) {
            double por3 = (cantidad*500)*0.40;
             double precio3 = (cantidad*500) - por3;
             System.out.println("La cantidad que debe pagar es :"+precio3);
        }
    }
    }
    



  