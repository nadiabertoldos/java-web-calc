
import javax.faces.bean.ManagedBean;


@ManagedBean
public class algoritmo {
    private String resultado;
    private double saldo, taxa, saldob;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    
    public void calculo(){
       saldob = saldo + ((saldo * taxa) / 100);
        
        resultado= "O novo saldo é: " + saldob ;              
    }
}
