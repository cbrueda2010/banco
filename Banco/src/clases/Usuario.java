package clases;

public class Usuario {
    private long identificacion;
    private String nombre;
    private Double total;
    private short tipo;
    private String clave;
    
    public Usuario(){
        identificacion = 0;
        nombre ="";
        total =0D;
        tipo = -1;
    }

    public void setTipo(short tipo) {
        this.tipo = tipo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTotal() {
        return total;
    }

   public short getTipo() {
        return tipo;
    }

   public void aumentar(double val){
        total += val;
    }
}
