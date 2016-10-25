package clases;


public class Ahorros extends Cuenta{
    
    public final static float INTERES = new Float(0.006);
    
    public Ahorros(long numero, double saldo) {
        super(numero, saldo);
    }
    
    public void liquidarMes(){
        saldo += saldo * INTERES;
    }
    
}
