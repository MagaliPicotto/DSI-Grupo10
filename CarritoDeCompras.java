import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.Date;

public class CarritoDeCompras{ 
    public static void main(String[] args) {
         
      class Carrito{
         private ArrayList<Item> items = new ArrayList<>();
         private Date fechaCompra;
         private Cliente cliente;
         private Direccion direccionEnvio;
         private Direccion direccionCobro;
         private ArrayList<Pago> pagos = new ArrayList<>();
         private Estado estado;

         public void setEstado(estado) {
          this.estado = estado;
         }

         public void cerrarCompra() {
          this.estado = ECFieldstado.CERRADO; 
        }

         public float getMontoPagado(){
            //implementame
         }
         public float getMontoCarrito(){
            //implementame
         }
         public float getMontoDeuda(){
            //implementame
         }
        }

 
      class Item {
         private Carrito carrito;
         private Producto producto;
         private int cantidad;
         private float precioUnitario;

         public float getPrecio() {
          return this.cantidad * this.precioUnitario;
        }
         public float getPrecioActual(){
          return producto.getPrecio(carrito.fechaCompra);
        }
    }
        class Cliente {}

        class Direccion {}

        class Pago {
            private Carrito carrito;
            private Tarjeta tarjeta;
            private float monto;

            public boolean verificarTarjeta() {
             //implementame
            }
        }

        enum Estado {
         EN_PROCESO,
         CERRADO
       }

        class Producto {
            private String EAN13;
            private String nombre;
            private ArrayList<PrecioProducto> preciosHistoricos = new ArrayList<>();

         public float getPrecio(fecha){
            //implementame
         }
        }

        class PrecioProducto {
         private Date fechaInicioVigencia ;
         private Date fechaFinVigencia ;
         private float precio;

         public 
       } 

       class Pais {
        private String nombre;
       }

       class Provincia {
        private String nombre;
        private Pais pais;
       }

       class Ciudad {
        private String nombre;
        private Provincia provincia;
        }

        class Tarjeta{
            private String nombre;
            private MarcaTarjerta marcaTarjeta;
            private String ultimos4Digitos;
        }

        enum MarcaTarjerta {
         VISA,
         MASTERCARD,
         NARANJA
         }
   }
}