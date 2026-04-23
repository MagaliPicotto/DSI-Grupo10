package carrito;
import java.util.Date;

public class PrecioProducto {
    private Date fechaInicioVigencia ;
    private Date fechaFinVigencia ;
    private float precio;

    public PrecioProducto(Date fechaInicioVigencia, Date fechaFinVigencia, float precio) {
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.precio = precio;
    }

    public Date getFechaInicioVigencia() {
        return this.fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return this.fechaFinVigencia;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setFechaInicioVigencia(Date fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean getCumpleVigencia(Date fecha) {
        return (fecha.after(fechaInicioVigencia) || fecha.equals(fechaInicioVigencia)) && 
        (fecha.before(fechaFinVigencia) || fecha.equals(fechaFinVigencia));
    }
} 