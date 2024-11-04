/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MercaRegala;

/**
 *
 * @author Karen
 */

public class CarneFresca extends Carne {
    private int diasCaducidad;

    public CarneFresca(String nombre, double peso, double precioKilo, String origen, int diasCaducidad) {
        super(nombre, peso, precioKilo, origen);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    int getdiasCaducidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}