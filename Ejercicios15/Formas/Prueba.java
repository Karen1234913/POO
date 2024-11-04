/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Formas;

/**
 *
 * @author Karen
 */
public class Prueba {
     public static void main(String[] args) {
        // Crear un array de formas
        Forma[] formas = new Forma[4];

        // Crear 2 cuadrados
        formas[0] = new Cuadrado("Cuadrado 1", 0, 0, "Rojo", 4);
        formas[1] = new Cuadrado("Cuadrado 2", 1, 1, "Verde", 5);

        // Crear 2 rectángulos
        formas[2] = new Rectangulo("Rectángulo 1", 2, 2, "Azul", 3, 6);
        formas[3] = new Rectangulo("Rectángulo 2", 3, 3, "Amarillo", 4, 8);

        // Calcular la suma de las áreas de todas las formas
        double sumaAreas = 0;
        double sumaAreasCuadrados = 0;
        int contadorCuadrados = 0;

        for (Forma forma : formas) {
            double area = forma.calcularArea();
            sumaAreas += area;

            // Verificar si la forma es un cuadrado
            if (forma instanceof Cuadrado) {
                sumaAreasCuadrados += area;
                contadorCuadrados++;
            }
        }

        // Mostrar resultados
        System.out.println("Suma de las areas de todas las formas: " + sumaAreas);
        if (contadorCuadrados > 0) {
            double mediaAreasCuadrados = sumaAreasCuadrados / contadorCuadrados;
            System.out.println("Media de las areas de los cuadrados: " + mediaAreasCuadrados);
        } else {
            System.out.println("No hay cuadrados en el array.");
        }
    }
}
