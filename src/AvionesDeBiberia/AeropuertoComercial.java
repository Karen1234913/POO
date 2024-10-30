/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvionesDeBiberia;

/**
 *
 * @author Karen
 */
public class AeropuertoComercial extends Aeropuerto {
    private int numeroTerminales;

    public AeropuertoComercial(String nombre, String ciudad, int numeroTerminales) {
        super(nombre, ciudad);
        this.numeroTerminales = numeroTerminales;
    }

    @Override
    public String toString() {
        return "AeropuertoComercial{" +
                "nombre='" + getNombre() + '\'' +
                ", ciudad='" + getCiudad() + '\'' +
                ", numeroTerminales=" + numeroTerminales +
                '}';
    }
}