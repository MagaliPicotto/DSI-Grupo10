package pago;
import carrito.Carrito;


public class Pago {
    private Carrito carrito;
    private Tarjeta tarjeta;
    private float monto;

    public Pago(Carrito carrito, Tarjeta tarjeta, float monto) {
        this.carrito = carrito;
        this.tarjeta = tarjeta;
        this.monto = monto;
    }

    public Carrito getCarrito() {
        return this.carrito;
    }

    public Tarjeta getTarjeta() {
        return this.tarjeta;
    }

    public float getMonto() {
        return this.monto;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public boolean verificarTarjeta() {
        return true;
    }

}