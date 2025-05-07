package facede;

import subsistema2.cepAPI;
import subsistemaExterno.CrmService;

public class Facade {
    public void migrarCliente (String nome, String cep) {
        String cidade = cepAPI.getInstancia().recuperarCidade(cep);
        String esttado = cepAPI.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, esttado);
    }

}
