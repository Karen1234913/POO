/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eva;

/**
 *
 * @author Karen
 */
class ProductosCongeladosAire extends ProductosCongelados {
    private double porcentajeNitrogeno;
    private double porcentajeOxigeno;
    private double porcentajeDioxidoCarbono;
    private double porcentajeVaporAgua;

    public ProductosCongeladosAire(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen,
            double temperaturaMantenimiento,
            double porcentajeNitrogeno, double porcentajeOxigeno, double porcentajeDioxidoCarbono,
            double porcentajeVaporAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaMantenimiento);
        this.porcentajeNitrogeno = porcentajeNitrogeno;
        this.porcentajeOxigeno = porcentajeOxigeno;
        this.porcentajeDioxidoCarbono = porcentajeDioxidoCarbono;
        this.porcentajeVaporAgua = porcentajeVaporAgua;
    }

    @Override
    public String toString() {
        return "Producto Congelado por Aire: " + super.toString() +
                ", % Nitrógeno: " + porcentajeNitrogeno +
                ", % Oxígeno: " + porcentajeOxigeno +
                ", % Dióxido de Carbono: " + porcentajeDioxidoCarbono +
                ", % Vapor de Agua: " + porcentajeVaporAgua;
    }
}
