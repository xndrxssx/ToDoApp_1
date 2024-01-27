
package Anexos;
import java.util.ArrayList;
import java.util.Date;
import Tarefas.ListaDeTarefas;


public class AnotacaoListaDeTarefas extends Anotacao {
    private ListaDeTarefas listaDeTarefas;
    private ArrayList<AnotacaoTarefa> tarefas;

    public AnotacaoListaDeTarefas(ListaDeTarefas listaDeTarefas, String texto, Date dataCriacao) {
        super(texto);
        this.listaDeTarefas = listaDeTarefas;
        this.tarefas = new ArrayList<>();
    }

    public ListaDeTarefas getListaDeTarefas() {
        return listaDeTarefas;
    }

    public void setListaDeTarefas(ListaDeTarefas listaDeTarefas) {
        this.listaDeTarefas = listaDeTarefas;
    }

    // Adicionar tarefa à lista de tarefas
    public void adicionarTarefa(AnotacaoTarefa tarefa) {
        tarefas.add(tarefa);
    }

    // Remover tarefa da lista de tarefas
    public void removerTarefa(AnotacaoTarefa tarefa) {
        tarefas.remove(tarefa);
    }
    
    
}
