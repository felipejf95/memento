public class JogadorEstadoLesionado implements JogadorEstado{

    private JogadorEstadoLesionado() {};
    private static JogadorEstadoLesionado instace = new JogadorEstadoLesionado();
    public static  JogadorEstadoLesionado getInstance() {
        return instace;
    }
    public String getEstado(){
        return "Lesionado";
    }
}
