package apps;
public class Facebook extends ServicoDeMensagem {
    
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo Facebook");

    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens do Facebook");
    }   

    
    
}