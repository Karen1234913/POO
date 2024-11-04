/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MercaRegala;

/**
 *
 * @author Karen
 */
public class CarneCongeladoPizzaEntera extends CarneCongelada {
    private boolean enBandeja;

    public CarneCongeladoPizzaEntera(String nombre, double peso, double precioKilo, String origen,
            String empresaDistribuidora, boolean enBandeja) {
        super(nombre, peso, precioKilo, origen, empresaDistribuidora);
        this.enBandeja = enBandeja;
    }

    public boolean isEnBandeja() {
        return enBandeja;
    }
}
