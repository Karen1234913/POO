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
/*Ejercicio 4*/
/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.*/

public class Ejercicio4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de kilos de manzanas: ");
        double kilo = scanner.nextDouble();
        double PrecioPorKilo = 5.0; // 
        double descuento = 0.0;

        if (kilo > 0 && kilo <= 2) {
            descuento = 0.0;
        } else if (kilo > 2 && kilo <= 5) {
            descuento = 0.10;
        } else if (kilo > 5 && kilo <= 10) {
            descuento = 0.15;
        } else if (kilo > 10) {
            descuento = 0.20;
        }

        double precioTotal = kilo * PrecioPorKilo;
        double montoDescuento = precioTotal * descuento;
        double precioFinal = precioTotal - montoDescuento;

        System.out.println("Número de kilos de manzanas: " + kilo);
        System.out.println("Precio total sin descuento: $" + precioTotal);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Monto de descuento: $" + montoDescuento);
        System.out.println("Precio final con descuento: $" + precioFinal);
    }
}
