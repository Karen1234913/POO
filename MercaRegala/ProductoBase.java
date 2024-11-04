/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MercaRegala;

/**
 *
 * @author Karen
 */
public abstract class ProductoBase implements Producto {
    protected String nombre;
    protected double peso;
    protected double precioKilo;

    public ProductoBase(String nombre, double peso, double precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }
}
