/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MercaRegala;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Karen
 */
public class Almacen {
    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public List<CarneFresca> obtenerCarnesFrescasEnPeligro() {
        List<CarneFresca> enPeligro = new ArrayList<>();
        for (Producto producto : productos) {
            if (!(producto instanceof CarneFresca)) {
            } else {
                CarneFresca carneFresca = (CarneFresca) producto;
                if (carneFresca.getDiasCaducidad() <= 10) {
                    enPeligro.add(carneFresca);
                }
            }
        }
        return enPeligro;
    }

    public double calcularPrecioMedio() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularPrecio();
        }
        return total / productos.size();
    }

    public void eliminarBandejas() {
        productos.removeIf(producto -> producto instanceof CarneCongeladoPizzaEntera &&
                ((CarneCongeladoPizzaEntera) producto).isEnBandeja());
    }
}