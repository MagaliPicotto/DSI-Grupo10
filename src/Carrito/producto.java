package carrito;
import java.util.ArrayList;
import java.util.Date;

public class Producto {
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
            if (precioHist.getCumpleVigencia(fechaVigencia)) {
                return precioHist.getPrecio();
            }
        }
        
        return -1; 
    }

    public ArrayList<PrecioProducto> getPreciosHistoricos() {
        return preciosHistoricos;
    }

    public void setEAN13(String EAN13) {
        this.EAN13 = EAN13;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPreciosHistoricos(ArrayList<PrecioProducto> preciosHistoricos) {
        this.preciosHistoricos = preciosHistoricos;
    }
}
