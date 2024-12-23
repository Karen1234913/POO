/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvionesDeBiberia;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Karen
 */
    public abstract class Avion {
    private String nombre;
    private String matricula;
    private int autonomiaVuelo;
    protected List<Pasajero> pasajeros;

    public Avion(String nombre, String matricula, int autonomiaVuelo) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.autonomiaVuelo = autonomiaVuelo;
        this.pasajeros = new ArrayList<>();
    }

    public void agregarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public String getNombre() {
        return nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAutonomiaVuelo() {
        return autonomiaVuelo;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public abstract String obtenerInformacionCompleta();
}
