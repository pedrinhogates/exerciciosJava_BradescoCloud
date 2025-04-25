package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component

public class SistemaMensagem {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;
    public void confirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi confirmado com sucesso!");
    }

    public void enviarMensagemBoasVindas () {
        techTeam.setEmail("tech@dio.com");
        System.out.println(techTeam);
        System.out.println("Seja bem-vindo ao sistema de mensagens da DIO!");
    }
}
