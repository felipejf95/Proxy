import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JogadorProxyTest {

    @BeforeEach
    void set(){
        BD.addJogador(new Jogador("Joao", "Zagueiro", 4, false, 1000.0f));
        BD.addJogador(new Jogador("Mario", "Atacante", 9, true, 1100.0f));
    }

    @Test
    void deveRetornarInformacoesJogador(){
        JogadorProxy jogador = new JogadorProxy(4);
        assertEquals(Arrays.asList("Joao", "Zagueiro"), jogador.obterInformacoes());
    }

    @Test
    void deveRetornarSalarioJogador(){
        Tecnico tecnico = new Tecnico("Mauro", true, true);
        JogadorProxy jogador = new JogadorProxy(9);

        assertEquals(1100.0f, jogador.obtersalario(tecnico));
    }

    @Test
    void deveRetornarAuxiliarNaoAutorizado(){
        try {
            Tecnico tecnico = new Tecnico("Mano", false, true);
            JogadorProxy jogador = new JogadorProxy(9);
            assertEquals(1100.0f, jogador.obtersalario(tecnico));
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Membro da equipe nao e o tecnico", e.getMessage());
        }
    }

    @Test
    void deveRetornarMembroNaoAutorizado(){
        try {
            Tecnico tecnico = new Tecnico("Rocha", true, false);
            JogadorProxy jogador = new JogadorProxy(9);
            assertEquals(1100.0f, jogador.obtersalario(tecnico));
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Membro da equipe nao e auxiliar", e.getMessage());
        }
    }


}