import java.util.Scanner;

import apps.Facebook;
import apps.MSNMesseger;
import apps.ServicoDeMensagem;  
public class ComputadorCliente {
  
    public static void main(String[] args) {
        ServicoDeMensagem smi = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o aplicativo de mensagem: ");

        String appEscolhido = scanner.next();
    if (appEscolhido.equals("msn")) {
            smi = new MSNMesseger();
        } else if (appEscolhido.equals("facebook")) {
            smi = new Facebook();
        } else {
            System.out.println("Aplicativo inválido.");
        } 
            smi.enviarMensagem();
            smi.receberMensagem();
            scanner.close();
            return;

            
            
        }
        
            
        }
       /*  MSNMesseger msn = new MSNMesseger ();


        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("-------------------------------------------------");

        Facebook face  = new Facebook ();
        face.receberMensagem();
        face.enviarMensagem();*/


