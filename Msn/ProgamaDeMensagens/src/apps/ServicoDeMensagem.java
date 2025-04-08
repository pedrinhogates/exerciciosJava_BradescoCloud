package apps;
public abstract class ServicoDeMensagem {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected abstract void salvarHistoricoMensagem();
    protected void validarConexao() {
        System.out.println("Validando conexão com a internet...");
        // Lógica para validar a conexão com a internet
    }

}