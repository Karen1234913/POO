/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvionesDeBiberia;

/**
 *
 * @author Karen
 */
public class Avioneta extends Avion {
    private int numeroPasajeros;

    public Avioneta(String nombre, String matricula, int autonomiaVuelo, int numeroPasajeros) {
        super(nombre, matricula, autonomiaVuelo);
        this.numeroPasajeros = numeroPasajeros;
    }

        @Override
    public String obtenerInformacionCompleta() {
        return "Avioneta{" +
                "nombre='" + getNombre() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", autonomiaVuelo=" + getAutonomiaVuelo() +
                ", numeroPasajeros=" + numeroPasajeros +
                ", pasajeros=" + getPasajeros() +
                '}';
    }
}