/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Karen
 */
package GestionEmpleados;
public class Main {
        public static void main(String[] args) {
        
        comercial c1= new comercial("Ddr", 25, 1000, 100);
        Repartidor r1= new Repartidor("Fer", 20, 900, "zona 1");

        c1.plus();
        r1.plus();

        System.out.println(c1);
        System.out.println(r1);

}
}