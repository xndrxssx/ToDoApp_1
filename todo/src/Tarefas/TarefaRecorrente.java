package Tarefas;
import java.time.LocalDate;
import Caracteristicas.Prioridade;

/**
 *
 * @author Luyza
 */
public class TarefaRecorrente extends Tarefa {
    private int frequencia;
    private String periodo;


    public TarefaRecorrente(String titulo, String descricao, Prioridade prioridade, String periodicidade) {
        super(titulo, descricao, null , prioridade);
    }

    @Override
    public void marcarComoConcluida() {
        // Implementação específica para marcar uma TarefaRecorrente como concluída
    }
    
    public TarefaRecorrente(String titulo, String descricao, LocalDate dataDeVencimento, Prioridade prioridade, String periodo) {
        super(titulo, descricao, dataDeVencimento , prioridade);
        this.setFrequencia(1);
        this.setPeriodo(periodo);
    }


		//polimorfismo
        @Override
    public void realizar() {
        System.out.println("Realizando a tarefa recorrente: " + getDescricao());
        //ele herda de tarefa o metodo getDescricao
    }

		public void add(TarefaRecorrente tarefa) {
			// TODO Auto-generated method stub
			
		}

		public void remove(TarefaRecorrente tarefa) {
			// TODO Auto-generated method stub
			
		}

		public int getFrequencia() {
			return frequencia;
		}

		public void setFrequencia(int frequencia) {
			this.frequencia = frequencia;
		}

		public String getPeriodo() {
			return periodo;
		}

		public void setPeriodo(String periodo) {
			this.periodo = periodo;
		}

		@Override
		public boolean estaConcluida() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void editar(String novoTitulo, String novaDescricao, LocalDate novaDataDeVencimento,
				Prioridade novaPrioridade) {
			// TODO Auto-generated method stub
			
		}
}
