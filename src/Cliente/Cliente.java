package cliente;
import carrito.Carrito;
import envio.Direccion;
import java.util.ArrayList;
import java.util.List;
import pago.Tarjeta;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private List<Direccion> direcciones = new ArrayList<>();
    private List<Carrito> carritos = new ArrayList<>();
    private List<Tarjeta> tarjetas = new ArrayList<>();
    private boolean esPreferencial;

    public Cliente (String nombre, String apellido, String email, List<Direccion> direcciones, List<Carrito> carritos, List<Tarjeta> tarjetas, boolean esPreferencial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direcciones = direcciones;
        this.carritos = carritos;
        this.tarjetas = tarjetas;
        this.esPreferencial = esPreferencial;        
    }

    public float getMontoDeuda() {
        float totalDeuda = 0;
        for (Carrito c : carritos) {
            totalDeuda += c.getMontoDeuda();
        }
        return totalDeuda;
    }

    public boolean estaHabilitado() {
        return true;
    }

    public String getNombre() {
       return this.nombre;
    }

    public String getApellido() {
       return this.apellido;
    }

    public String getEmail() {
       return this.email;
    }

    public List<Direccion> getDirecciones() {
       return this.direcciones;
    }

    public List<Carrito> getCarritos() {
       return this.carritos;
    }

    public List<Tarjeta> getTarjetas() {
       return this.tarjetas;
    }

    public boolean isEsPreferencial() {
       return this.esPreferencial;
    }

    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public void setApellido(String apellido) {
       this.apellido = apellido;
    }

    public void setEmail(String email) {
       this.email = email;
    }

    public void setDirecciones(List<Direccion> direcciones) {
       this.direcciones = direcciones;
    }

    public void setCarritos(List<Carrito> carritos) {
       this.carritos = carritos;
    }

    public void setTarjetas(List<Tarjeta> tarjetas) {
       this.tarjetas = tarjetas;
    }

    public void setEsPreferencial(boolean esPreferencial) {
       this.esPreferencial = esPreferencial;
    }
}