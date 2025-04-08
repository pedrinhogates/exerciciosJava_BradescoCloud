public class ComputadorCliente {
    public static void main(String[] args) {
        MSNMesseger msn = new MSNMesseger ();

        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("-------------------------------------------------");
        
        Facebook face  = new Facebook ();
        face.receberMensagem();
        face.enviarMensagem();
    }
}
