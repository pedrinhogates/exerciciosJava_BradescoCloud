public class ServicoDeMensagem {
    
public void enviarMensagem() {
    //Primeiro validar se está conectado a internet
    ValidarConectadoInternet ();

    System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }
    private void ValidarConectadoInternet() {
        System.out.println("Validando conexão com a internet...");
    }
}