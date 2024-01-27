package Caracteristicas;
import java.util.ArrayList;
import java.util.List;
import Tarefas.ListaDeTarefas;

/**
 *
 * @author ALCC
 */
public class Prioridade extends ListaDeTarefas {
    // pode usar o nome da prioridade (urgente, dá pra procrastinar,enquanto houver amanhã há tempo)
    // ou associar por número (1 = urgente, 2 = dá pra atrasar, não tem pressa).
    private List<Prioridade> tarefasComPrioridade;

    public Prioridade(String nome) {
        super(nome); // Chama o construtor da classe base ListaDeTarefas
        tarefasComPrioridade = new ArrayList<>();
    }

    public void adicionarTarefaComPrioridade(Prioridade tarefa) {
        tarefasComPrioridade.add(tarefa);
    }

    public void removerTarefaComPrioridade(Prioridade tarefa) {
        tarefasComPrioridade.remove(tarefa);
    }

    public List<Prioridade> getTarefasComPrioridade() {
        return tarefasComPrioridade;
    }
    
    public void realizarTodasAsTarefasComPrioridade() {
        System.out.println("Realizando tarefas com prioridade da lista: " + getNome());
        //implemente o comportamento específico para as tarefas com prioridade aqui
    }
}