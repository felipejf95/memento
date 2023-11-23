public class JogadorEstadoDisponivel implements JogadorEstado{

    private JogadorEstadoDisponivel() {};
    private static JogadorEstadoDisponivel instance = new JogadorEstadoDisponivel();
    public static JogadorEstadoDisponivel getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Disponivel";
    }
}
