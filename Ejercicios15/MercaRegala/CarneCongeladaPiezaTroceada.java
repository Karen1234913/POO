/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MercaRegala;

/**
 *
 * @author Karen
 */
public class CarneCongeladaPiezaTroceada extends CarneCongelada {
    private int numeroPiezas;

    public CarneCongeladaPiezaTroceada(String nombre, double peso, double precioKilo, String origen,
            String empresaDistribuidora, int numeroPiezas) {
        super(nombre, peso, precioKilo, origen, empresaDistribuidora);
        this.numeroPiezas = numeroPiezas;
    }

    public int getNumeroPiezas() {
        return numeroPiezas;
    }
}