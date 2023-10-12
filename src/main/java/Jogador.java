import java.util.Arrays;
import java.util.List;

public class Jogador implements IJogador{

    String nome;
    String posicao;
    int numero;
    boolean capitao;
    Float salario;

    public Jogador(String nome, String posicao, int numero, boolean capitao, Float salario) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
        this.capitao = capitao;
        this.salario = salario;
    }

    public Jogador(int numero){
        this.numero = numero;
        Jogador objeto = BD.getJogador(numero);
        this.nome = objeto.nome;
        this.posicao = objeto.posicao;
        this.capitao = objeto.capitao;
        this.salario = objeto.salario;
    }

    public Integer getNumero(){
        return this.numero;
    }

    @Override
    public Float obtersalario(Tecnico tecnico) {
        return this.salario;
    }

    @Override
    public List<String> obterInformacoes() {
        return Arrays.asList(this.nome, this.posicao);
    }
}
