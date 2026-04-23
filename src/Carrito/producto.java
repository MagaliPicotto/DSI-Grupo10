package Carrito;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

class Producto {
    private String EAN13;
    private String nombre;
    private ArrayList<PrecioProducto> preciosHistoricos = new ArrayList<>();

    public Producto(String EAN13, String nombre, ArrayList<PrecioProducto> preciosHistoricos) {
        this.EAN13 = EAN13;
        this.nombre = nombre;
        this.preciosHistoricos = preciosHistoricos;
    }

    public String getEAN() { return EAN13; }
    public String getNombre() { return nombre; }
    public String getNombreCorto() { return nombre.length() > 10 ? nombre.substring(0, 10) : nombre; }

    public float getPrecio(Date fechaVigencia){
        for (PrecioProducto precioHist : preciosHistoricos) {
            if (precioHist.getFechaVigencia().equals(fechaVigencia)) {
                return precioHist.getPrecio();
            }
        }
        
        return -1; 
    }
}
