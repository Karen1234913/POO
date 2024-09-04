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
/*Ejercicio 3*/
/*Un supermercado realiza una tómbola con todos los clientes, si son hombres tienen que sacar
de una canasta una bolita la cual tiene un número grabado y si son mujeres lo mismo pero de
otra canasta, los premios se dan bajo la siguiente tabla:
HOMBRES                          MUJERES
# Bolita Premio                # bolita Premio
1 Desodorante                  1 Loción
2 Six-Pack de cerveza          2 Bikini
3 Camiseta                     3 Crema para la cara
4 Pantaloneta                  4 Plancha para el cabello
5 Sudadera                     5 Esmalte de uñas*/

public class Ejercicio3 {
   public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
      int sexo, h ,m ;
        System.out.println("Usted es :");
        System.out.println("1.Mujer");
        System.out.println("2. Hombre");
        System.out.println("Ingrese su genero: ");
        sexo = input.nextInt();
        if (sexo == 2) {
            System.out.println("Ingrese el numero grabado de la bolita ");
            h = input.nextInt();
            switch(h){
                case 1 :
                    System.out.println("Su premio es un desorante");
                    break;
                case 2:
                    System.out.println("Su premio es un Six-Pack de cerveza");
                    break;
                case 3: 
                    System.out.println("Su premio es una camiseta");
                    break;
                case 4 :
                    System.out.println("Su premio es una pantaloneta");
                    break;
                case 5:
                    System.out.println("Su premio es una sudadera");
                    break;
                case 6:
                    System.out.println("Se equivoco de numero o escribio mal");
                    break;
            }
        }
        else if (sexo ==1) {
            System.out.println("Ingrese el numero grabado de la bolita ");
            m = input.nextInt();
            switch(m){
                case 1 :
                    System.out.println("Su premio es una locion");
                    break;
                case 2:
                    System.out.println("Su premio es un bikini");
                    break;
                case 3: 
                    System.out.println("Su premio es una crema para la cara");
                    break;
                case 4 :
                    System.out.println("Su premio es una plancha para el cabello");
                    break;
                case 5:
                    System.out.println("Su premio es un esmalte de uñas");
                    break;
                case 6:
                    System.out.println("Se equivoco de numero o escribio mal");
                    break;
            }
        }
    }
}

 

