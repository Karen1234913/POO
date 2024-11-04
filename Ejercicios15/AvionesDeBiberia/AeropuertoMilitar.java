/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvionesDeBiberia;

/**
 *
 * @author Karen
 */
public class AeropuertoMilitar extends Aeropuerto {
    private String nombreEnClave;

    public AeropuertoMilitar(String nombre, String ciudad, String nombreEnClave) {
        super(nombre, ciudad);
        this.nombreEnClave = nombreEnClave;
    }

    @Override
    public String toString() {
        return "AeropuertoMilitar{" +
                "nombre='" + getNombre() + '\'' +
                ", ciudad='" + getCiudad() + '\'' +
                ", nombreEnClave='" + nombreEnClave + '\'' +
                '}';
    }
  }