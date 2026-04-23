package pago;

public class Tarjeta {
    private String nombre;
    private MarcaTarjeta marcaTarjeta;
    private String ultimos4digitos;

    public Tarjeta(String nombre, MarcaTarjeta marcaTarjeta, String ultimos4digitos) {
        this.nombre = nombre;
        this.marcaTarjeta = marcaTarjeta;
        this.ultimos4digitos = ultimos4digitos;
    }
}