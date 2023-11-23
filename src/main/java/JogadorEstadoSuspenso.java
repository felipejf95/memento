public class JogadorEstadoSuspenso implements JogadorEstado{

    private JogadorEstadoSuspenso() {};
    private static JogadorEstadoSuspenso instance = new JogadorEstadoSuspenso();
    public static JogadorEstadoSuspenso getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Suspenso";
    }
}
