/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eva;

/**
 *
 * @author Karen
 */
class ProductosFrescos extends Producto {
    
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductosFrescos(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    @Override
    public String toString() {
        return "Producto Fresco: " + super.toString() + 
               ", Fecha de Envasado: " + fechaEnvasado + 
               ", País de Origen: " + paisOrigen;
    }
}
