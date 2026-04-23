import java.util.List;
import java.util.ArrayList;

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

    public double getMontoDeuda() {
        double totalDeuda = 0;
        for (Carrito c : carritos) {
            totalDeuda += c.getMontoDeuda();
        }
        return totalDeuda;
    }

    public boolean estaHabilitado() {
        return true;
    }
}