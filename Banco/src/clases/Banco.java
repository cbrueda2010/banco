package clases;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private Mes mes;
    private List<Usuario>usuarios;
    private long nit;
    private String nombre;
    private double total;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
     public Banco() {
        
        mes = new Mes();
        usuarios = new ArrayList<Usuario>();
        nit = 12345678L;
        nombre = "BBVA FRANCES";
        total = 0;        
    }
    
    public void actualizar(double val){
        total += val;
    }
    
    public void crearAdministrador() {
       Usuario administrador = new Usuario();
       administrador.setIdentificacion(1033735532);
       administrador.setNombre("admin");
       administrador.setClave("12345678");
       usuarios.add(administrador);
    }
}
