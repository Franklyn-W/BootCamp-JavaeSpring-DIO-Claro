package collectionsJava.List.excercicosOpBasicasList.exerc01;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        // Criação de nova lista para armazenar os itens a serem removidos
        List<Tarefa> tarefasRemover = new ArrayList<>();

        // Comparando todos os itens de tarefaLista com a descricao recebida.
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {

                // Caso a descricao da tarefa da lista seja igual a descricao recebida,
                // adicionar a lista tarefasRemover
                tarefasRemover.add(t);
            }

        }
        // Finaliza removendo todos os itens indicados pela lista tarefasRemover
        tarefaList.removeAll(tarefasRemover);

    }

    public int obterTotalTarefas() {
        return tarefaList.size();
    }

    public void ObterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("Numero de tarefas: " + listaTarefa.obterTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("Numero de tarefas: " + listaTarefa.obterTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("Numero de tarefas: " + listaTarefa.obterTotalTarefas());

        listaTarefa.ObterDescricoesTarefas();
    }
}
