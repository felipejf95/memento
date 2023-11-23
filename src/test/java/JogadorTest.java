import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveArmazenarEstados(){
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertEquals(2, jogador.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial(){
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        jogador.restauraEstado(0);
        assertEquals(JogadorEstadoDisponivel.getInstance(), jogador.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior(){
        Jogador jogador = new Jogador();
        jogador.setEstado(JogadorEstadoDisponivel.getInstance());
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        jogador.restauraEstado(1);
        assertEquals(JogadorEstadoSuspenso.getInstance(), jogador.getEstado());
    }

    @Test
    void deveRetornaExcecaoIndiceInvalido(){
        try{
            Jogador jogador = new Jogador();
            jogador.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("indice invalido", e.getMessage());
        }
    }
}