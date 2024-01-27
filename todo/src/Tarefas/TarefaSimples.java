package Tarefas;
import java.time.LocalDate;
import Caracteristicas.Prioridade;

/**
 *
 * @author Luyza
 */
public class TarefaSimples extends Tarefa {
    
    public TarefaSimples(String titulo, String descricao, LocalDate dataDeVencimento, Prioridade prioridade) {
        super(titulo, descricao, null, prioridade);
    }

    @Override
    public void marcarComoConcluida() {
        // Implementação específica para marcar uma TarefaSimples como concluída
    }
    
    
    public TarefaSimples(String descricao) {
        super(descricao); //chama o construtor da classe base Tarefa
    }
    
    //polimorfismo
    @Override
    public void realizar() {
        System.out.println("Realizando a tarefa simples: " + getDescricao());
        //ele herda de tarefa o metodo getDescricao
    }

	public void add(TarefaSimples tarefa) {
		// TODO Auto-generated method stub
		
	}

	public void remove(TarefaSimples tarefa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaConcluida() {
		return false;
	}

	@Override
	public void editar(String novoTitulo, String novaDescricao, LocalDate novaDataDeVencimento,
			Prioridade novaPrioridade) {
			
	}
}
