package OperaçõesList;

import java.util.ArrayList;
import java.util.List;

public class listaTarefa {
    private List<Tarefa> tarefalist;

    public listaTarefa() {
        this.tarefalist = new ArrayList<>();
    }


    public void adicionarTarefa(String descricao) {
        tarefalist.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasARemover = new ArrayList<>();
        for (Tarefa t : tarefalist) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasARemover.add(t);
            }
        }
        tarefalist.removeAll(tarefasARemover);
    }

    public int quantidadeTarefas() {
        return tarefalist.size();
    }

    public void descricaoTarefas () {
        System.out.println(tarefalist);
        }
    }
