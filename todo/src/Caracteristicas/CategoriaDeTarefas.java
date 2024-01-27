/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caracteristicas;

import Tarefas.TarefaRecorrente;
import Tarefas.TarefaSimples;

/**
 *
 * @author Luyza
 */
public class CategoriaDeTarefas extends Categoria {
	private TarefaSimples tarefa; 
	private TarefaRecorrente tarefarec;
    
    public CategoriaDeTarefas(String nome, String cor, String icone) {
        super(nome, cor, icone);
        this.setTarefa(new TarefaSimples(nome));
 
    }

    public void adicionarTarefa(TarefaSimples tarefa) {
        tarefa.add(tarefa);
    }

    public void removerTarefa(TarefaSimples tarefa) {
        tarefa.remove(tarefa);
    }
    
    public void adicionarTarefaRec(TarefaRecorrente tarefa) {
        tarefa.add(tarefa);
    }

    public void removerTarefaRec(TarefaRecorrente tarefa) {
        tarefa.remove(tarefa);
    }

	public TarefaSimples getTarefa() {
		return tarefa;
	}

	public void setTarefa(TarefaSimples tarefa) {
		this.tarefa = tarefa;
	}

	public TarefaRecorrente getTarefarec() {
		return tarefarec;
	}

	public void setTarefarec(TarefaRecorrente tarefarec) {
		this.tarefarec = tarefarec;
	}
}
