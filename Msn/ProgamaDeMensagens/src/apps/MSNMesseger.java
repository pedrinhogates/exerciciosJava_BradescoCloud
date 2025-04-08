package apps;
public class MSNMesseger  extends ServicoDeMensagem {

    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo MSN Messenger");

    }

    @Override
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando histórico de mensagens do MSN");
    }   

    
    
    
        
    }

