package Carritos;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


enum Estado {
   EN_PROCESO,
   CERRADO
}

public class Carrito {
   private List<Item> items = new ArrayList<>();
   private Date fechaCompra;
   private Cliente cliente;
   private Direccion direccionEnvio;
   private Direccion direccionCobro;
   private List<Pago> pagos = new ArrayList<>();
   private Estado estado;

   public void setEstado(Estado estado) {
      this.estado = estado;
   }

   public void cerrar() {
      this.setEstado(Estado.CERRADO);
   }

   public double getMontoCarrito() {
      double total = 0;
      for (Item i : items) {
         total += i.getPrecio();
      }
      return total;
   }

   public double getMontoPagado() {
      double totalPagado = 0;
      for (Pago p : pagos) {
         totalPagado += p.getMonto();
      }
      return totalPagado;
   }

   public double getMontoDeuda() {
      return this.getMontoCarrito() - this.getMontoPagado();
   }

   public Date getFechaCompra() {
      return fechaCompra;
   }
}

