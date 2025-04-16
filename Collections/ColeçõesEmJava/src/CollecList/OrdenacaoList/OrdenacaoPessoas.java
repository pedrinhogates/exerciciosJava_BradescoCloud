package CollecList.OrdenacaoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas() {
        this.pessoasList = new ArrayList<>();
    }
    
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa (nome, idade, altura));
    }

    public List <Pessoa> ordenarPorIdade() {
            List <Pessoa> pessoasOrdenadas = new ArrayList<>(pessoasList);
            Collections.sort(pessoasOrdenadas);
            return pessoasOrdenadas;
            
    }   
    public List <Pessoa> ordenarPorAltura(){
        List <Pessoa> pessoasOrdenadas = new ArrayList<>(pessoasList);
         Collections.sort(pessoasOrdenadas, new CompartorPorAltura());
        return pessoasOrdenadas;
    }
    }

