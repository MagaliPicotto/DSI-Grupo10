package Carritos;
import java.util.Date;

class PrecioProducto {
    private Date fechaInicioVigencia ;
    private Date fechaFinVigencia ;
    private float precio;

    public PrecioProducto(Date fechaInicioVigencia, Date fechaFinVigencia, float precio) {
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.precio = precio;
    }

    public Date getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public boolean getCumpleVigencia(Date fecha) {
        return (fecha.after(fechaInicioVigencia) || fecha.equals(fechaInicioVigencia)) && 
        (fecha.before(fechaFinVigencia) || fecha.equals(fechaFinVigencia));
    }

    public double getPrecio() {
        return precio;
    }
} 