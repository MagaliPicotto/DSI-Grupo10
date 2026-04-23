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
    
    public String getCalle1() {
        return calle1;
    }

    public String getCalle2() {
        return calle2;
    }

    public int getAltura() {
        return altura;
    }

    public boolean isSinAltura() { // Para booleanos se usa "is" en lugar de "get"
        return this.sinAltura;
    }

    public int getPiso() {
        return this.piso;
    }

    public int getCuerpo() {
        return this.cuerpo;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public Ciudad getCiudad() {
        return this.ciudad;
    }

    public void setCalle1(String calle1) {
        this.calle1 = calle1;
    }

    public void setCalle2(String calle2) {
        this.calle2 = calle2;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setSinAltura(boolean sinAltura) {
        this.sinAltura = sinAltura;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public void setCuerpo(int cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setCiudad(Ciudad ciudad) {
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




