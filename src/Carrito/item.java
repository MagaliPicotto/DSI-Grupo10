package carrito;

public class Item {
    private Carrito carrito;
    private Producto producto;
    private int cantidad;
    private float precioUnitario;

    public Item(Carrito carrito, Producto producto, int cantidad) {
        this.carrito = carrito;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = producto.getPrecio(this.carrito.getFechaCompra());
    }

    public Carrito getCarrito() {
        return this.carrito;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public float getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getPrecio() {
        return this.cantidad * this.precioUnitario;
    }

    public float getPrecioOficial(){
        return producto.getPrecio(this.carrito.getFechaCompra());
    }

    public float getDescuento() {
        return this.getPrecioOficial() - this.getPrecio();
    }
}
