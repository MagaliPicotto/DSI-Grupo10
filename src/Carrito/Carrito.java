package carrito;
import cliente.Cliente;
import envio.Direccion;
import java.util.Date;
import java.util.List;
import pago.Pago;

public class Carrito {
   private List<Item> items;
   private Date fechaCompra;
   private Cliente cliente;
   private Direccion direccionEnvio;
   private Direccion direccionCobro;
   private List<Pago> pagos;
   private Estado estado;

   public Carrito(List<Item> items, Date fechaCompra, Cliente cliente, Direccion direccionEnvio, Direccion direccionCobro, List<Pago> pagos, Estado estado
) {
   this.items = items;
   this.fechaCompra = fechaCompra;
   this.cliente = cliente;
   this.direccionEnvio = direccionEnvio;
   this.direccionCobro = direccionCobro;
   this.pagos = pagos;
   this.estado = estado;
}

   public void cerrar() {
      this.estado = Estado.CERRADO;
   }

   public float getMontoCarrito() {
      float total = 0;
      for (Item i : this.items) {
         total += i.getPrecio();
      }
      return total;
   }

   public float getMontoPagado() {
      float totalPagado = 0;
      for (Pago p : this.pagos) {
         totalPagado += p.getMonto();
      }
      return totalPagado;
   }

   public float getMontoDeuda() {
      return this.getMontoCarrito() - this.getMontoPagado();
   }

   public Date getFechaCompra() {
      return this.fechaCompra;
   }

   public List<Item> getItems() {
      return items;
   }

   public void setItems(List<Item> items) {
      this.items = items;
   }

   public void setFechaCompra(Date fechaCompra) {
      this.fechaCompra = fechaCompra;
   }

   public Cliente getCliente() {
      return cliente;
   }

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public Direccion getDireccionEnvio() {
      return direccionEnvio;
   }

   public void setDireccionEnvio(Direccion direccionEnvio) {
      this.direccionEnvio = direccionEnvio;
   }

   public Direccion getDireccionCobro() {
      return direccionCobro;
   }

   public void setDireccionCobro(Direccion direccionCobro) {
      this.direccionCobro = direccionCobro;
   }

   public List<Pago> getPagos() {
      return pagos;
   }

   public void setPagos(List<Pago> pagos) {
      this.pagos = pagos;
   }

   public Estado getEstado() {
      return estado;
   }

   public void setEstado(Estado estado) {
      this.estado = estado;
   }
}

