
import javax.faces.bean.ManagedBean;


@ManagedBean
public class algoritmo {
    private String resultado;
    private int valor1, valor2, valor3, meio;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getValor3() {
        return valor3;
    }

    public void setValor3(int valor3) {
        this.valor3 = valor3;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public void valormeio(){
        if (valor1>valor2 && valor1<valor3){
            meio = valor1;
        }
        else if(valor1<valor2 && valor2>valor3){
            meio = valor3;
        }
        else{        
            meio = valor2;
        }
        resultado = "O valor do meio é: " + meio;              
    }
}
