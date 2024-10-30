/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvionesDeBiberia;

/**
 *
 * @author Karen
 */
public class AvionPasajero extends Avion {
    private int numeroPasajero;

    public AvionPasajero(String nombre, String matricula, int autonomiaVuelo, int numeroPasajeros) {
        super(nombre, matricula, autonomiaVuelo);
        this.numeroPasajero = numeroPasajeros;
    }

    @Override
    public String obtenerInformacionCompleta() {
        return "AvionPasajeros{" +
                "nombre='" + getNombre() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", autonomiaVuelo=" + getAutonomiaVuelo() +
                ", numeroPasajeros=" + numeroPasajero +
                ", pasajeros=" + getPasajeros() +
                '}';
    }
}
