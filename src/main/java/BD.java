import java.util.HashMap;
import java.util.Map;

public class BD {

    private static Map<Integer, Jogador> jogadores = new HashMap<>();

    public static Jogador getJogador(Integer numero){
        return jogadores.get(numero);
    }

    public static void addJogador(Jogador jogador){
        jogadores.put(jogador.getNumero(), jogador);
    }
}
