public class FormatadorDeCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("215154515");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("cep não corresponde com as regras de negocio");
            
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}
