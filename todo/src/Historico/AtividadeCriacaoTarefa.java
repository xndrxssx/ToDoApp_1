package Historico;
import java.util.Date;
import Tarefas.Tarefa;


public class AtividadeCriacaoTarefa extends AtividadeHistorico{
    private Tarefa tarefa;

    public AtividadeCriacaoTarefa(Date dataHora, Tarefa tarefa) {
        super(dataHora, "Criação da tarefa: " + tarefa.getDescricao()); // Fornecendo a descrição apropriada ao criar a atividade
        this.tarefa = tarefa;
        registrarAtividade(dataHora, "Criação da tarefa: " + tarefa.getDescricao()); // Registrando a atividade no histórico
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    // Método para exibir as atividades de criação no histórico
    public void mostrarHistoricoDeCriacao() {
        mostrarHistorico(); // Chama o método para mostrar o histórico na superclasse
    }
}
