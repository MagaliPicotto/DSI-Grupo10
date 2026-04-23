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

    public String getNombre() {
        return this.nombre;
    }

    public MarcaTarjeta getMarcaTarjeta() {
        return this.marcaTarjeta;
    }

    public String getUltimos4digitos() {
        return this.ultimos4digitos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarcaTarjeta(MarcaTarjeta marcaTarjeta) {
        this.marcaTarjeta = marcaTarjeta;
    }

    public void setUltimos4digitos(String ultimos4digitos) {
        this.ultimos4digitos = ultimos4digitos;
    }

}