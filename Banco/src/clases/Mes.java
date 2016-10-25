package clases;

public class Mes {
    
    private short numero;

    public Mes() {
        numero = 1;
    }

    public void actualizarMes(){
        numero ++;
    }
    
    public short getNumero() {
        return numero;
    }
}
