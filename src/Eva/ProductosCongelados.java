/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eva;

/**
 *
 * @author Karen
 */
class ProductosCongelados extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private double temperaturaMantenimiento;

    public ProductosCongelados(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
            double temperaturaMantenimiento) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaMantenimiento = temperaturaMantenimiento;
    }

    @Override
    public String toString() {
        return "Producto Congelado: " + super.toString() +
                ", Fecha de Envasado: " + fechaEnvasado +
                ", País de Origen: " + paisOrigen +
                ", Temperatura de Mantenimiento: " + temperaturaMantenimiento + "°C";
    }
     }