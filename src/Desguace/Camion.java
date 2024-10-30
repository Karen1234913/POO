/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desguace;

/**
 *
 * @author Karen
 */
public class Camion extends Vehiculo { // el modificador de visibilidad queda defualt si no pongo nada
    private double tamanoRemolque;
    private int numeroEjes;

    public Camion(double precioCompra, String marca, double tamanoRemolque, int numeroEjes) {
        super(precioCompra, marca);
        this.tamanoRemolque = tamanoRemolque;
        this.numeroEjes = numeroEjes;
    }

    @Override
    public double precioVenta() {
        return precioCompra * 1.6 * numeroEjes; // Precio de venta inicial multiplicado por el número de ejes
    }
}
