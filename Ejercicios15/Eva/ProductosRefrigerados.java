/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eva;

/**
 *
 * @author Karen
 */
public class ProductosRefrigerados extends Producto {

    private String codigoSupervision;
    private String fechaEnvasado;
    private double temperaturaMantenimiento;
    private String paisOrigen;

    public ProductosRefrigerados(String fechaCaducidad, String numeroLote, String codigoSupervision,
            String fechaEnvasado, double temperaturaMantenimiento, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Producto Refrigerado: " + super.toString() +
                ", Código de Supervisión: " + codigoSupervision +
                ", Fecha de Envasado: " + fechaEnvasado +
                ", Temperatura de Mantenimiento: " + temperaturaMantenimiento +
                "°C, País de Origen: " + paisOrigen;
    }
}