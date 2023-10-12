import java.util.List;
public class JogadorProxy implements IJogador{

    private Jogador jogador;
    private Integer numero;

    public JogadorProxy(Integer numero){
        this.numero = numero;
    }

    public Float obtersalario(Tecnico tecnico){
        if(!(tecnico.isTecnico())){
            throw new IllegalArgumentException("Membro da equipe nao e o tecnico");
        }
        if(!(tecnico.isAuxiliar())){
            throw new IllegalArgumentException("Membro da equipe nao e auxiliar");
        }
        if(this.jogador == null){
            this.jogador = new Jogador(this.numero);
        }
        return this.jogador.obtersalario(tecnico);
    }


    public List<String> obterInformacoes(){
       if(this.jogador == null){
           this.jogador = new Jogador(this.numero);
       }
       return this.jogador.obterInformacoes();
    }
}
