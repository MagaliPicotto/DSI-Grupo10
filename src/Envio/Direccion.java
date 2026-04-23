package envio;
public class Direccion {
    private String calle1;
    private String calle2;
    private int altura;
    private boolean sinAltura;
    private int piso;
    private int cuerpo;
    private String departamento;
    private Ciudad ciudad;

    
    public Direccion(String calle1, String calle2, int altura, boolean sinAltura, int piso, int cuerpo, String departamento, Ciudad ciudad) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.altura = altura;
        this.sinAltura = sinAltura;
        this.piso = piso;
        this.cuerpo = cuerpo;
        this.departamento = departamento;
        this.ciudad = ciudad;
    }

    
    
    public String getDireccion() {
        return calle1 + " " + (sinAltura ? "S/N" : altura) + ", " + ciudad.getNombre();
    }

    public String getLatitud() { return "0.0"; }
    public String getLongitud() { return "0.0"; }

    public boolean estaHabilitadaEnvio() {
        return true; 
   }
}




