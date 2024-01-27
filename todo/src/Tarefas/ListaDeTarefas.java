package Tarefas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luyza
 */
public class ListaDeTarefas {
    private String nome;
    private Date dataCriacao;
    private List<Tarefa> tarefas;
    
    public ListaDeTarefas(String nome) {
        this.nome = nome;
        this.dataCriacao = new Date(); //define a data de criação como a data atual
        this.tarefas = new ArrayList<>(); //inicializa a coleção de tarefas como uma lista vazia
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    //métodos para manipular a lista de tarefas

    public String getNome() {
        return nome;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }
    
    public void realizarTodasAsTarefas() {
        System.out.println("Realizando todas as tarefas da lista: " + nome);
        for (Tarefa tarefa : tarefas) {
            tarefa.realizar(); // Chama o método realizar de cada tarefa na lista
        }
    }
}
