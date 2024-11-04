/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Desguace;

/**
 *
 * @author Karen
 */
abstract class Vehiculo {
    protected double precioCompra;
    protected String marca;

    public Vehiculo(double precioCompra, String marca) {
        this.precioCompra = precioCompra;
        this.marca = marca;
    }

    public abstract double precioVenta();
}
