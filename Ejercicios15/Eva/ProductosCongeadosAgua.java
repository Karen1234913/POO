/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eva;

/**
 *
 * @author Karen
 */
class ProductosCongeladosAgua extends ProductosCongelados {
    private double salinidad;

    public ProductosCongeladosAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
            double temperaturaMantenimiento, double salinidad) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return "Producto Congelado por Agua: " + super.toString() +
                ", Salinidad: " + salinidad + " gramos de sal/Litro de agua";
    }
}