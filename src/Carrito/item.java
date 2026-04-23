package Carrito;

class Item {
    private Carrito carrito;
    private Producto producto;
    private int cantidad;
    private float precioUnitario;

    public Item(Carrito carrito, Producto producto, int cantidad) {
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = this.getPrecioOficial();
    }

    public float getPrecio() {
        return this.cantidad * this.precioUnitario;
    }

    public float getPrecioOficial(){
        return producto.getPrecio(carrito.getFechaCompra());
    }

    public float getDescuento() {
        return this.getPrecioOficial() - this.getPrecio();
    }
}
