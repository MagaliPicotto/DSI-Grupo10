package Pago;


public class Pago {
    private Carrito carrito;
    private Tarjeta tarjeta;
    private double monto;

    public Pago(Carrito carrito, Tarjeta tarjeta, double monto) {
        this.carrito = carrito;
        this.tarjeta = tarjeta;
        this.monto = monto;
    }

    public boolean verificarTarjeta() {
        return true;
    }

    public double getMonto() { return monto; }
}