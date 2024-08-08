
import javax.faces.bean.ManagedBean;


@ManagedBean
public class Inicial {
    private String nome, sexo, resultado, cidade;
    private double seguro;
    private int idade;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    public String getNome() {
        return nome;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public void calculo(){
        if (idade < 25){
            double aux;
            aux = (seguro / 100) * 20;
            seguro = aux + seguro;
        }
        if (idade >= 25 && idade <= 30){
            double aux;
            aux = (seguro / 100) * 10;
            seguro = aux + seguro;
        }
        if ("Diadema".equals(cidade)){ 
            double aux;
            aux = (seguro / 100) * 10;
            seguro = aux + seguro;
        }
        if ("São Bernardo".equals(cidade)){
            double aux;
            aux = (seguro / 100) * 20;
            seguro = aux + seguro;
        }
        if ("São Caetano".equals(cidade)){
            double aux;
            aux = (seguro / 100) * 5;
            seguro = aux + seguro;
        }
        if ("Santo André".equals(cidade)){
            double aux;
            aux = (seguro / 100) * 15;
            seguro = aux + seguro;
        }
        if ("Feminino".equals(sexo)){
            double aux;
            aux = (seguro / 100) * 5;
            seguro = seguro - aux;
        }
        resultado = "Valor do seguro baseado nas informações: " + seguro;              
    }
}
