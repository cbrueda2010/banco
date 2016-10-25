package clases;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cuenta {

    protected long numero;
    protected double saldo;

    public Cuenta(long numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void consignar(float monto){
        saldo = saldo + monto;
    }
    
    public void retirar(float monto){
        saldo = saldo - monto;
    }
    
    public void generarNumero(long documento, short tipo, int consecutivo){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String doc = String.valueOf(documento);
        String numero = "";
        Date fecha = new Date();

        numero.concat(sdf.format(fecha));
        numero.concat(doc.substring(doc.length()-3));
        numero.concat(String.valueOf(consecutivo));
        numero.concat(String.valueOf(tipo));
        
    }
    
    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
