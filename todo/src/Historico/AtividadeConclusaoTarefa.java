package Historico;
import java.util.Date;
import Tarefas.Tarefa;

public class AtividadeConclusaoTarefa extends AtividadeHistorico{
    private Tarefa tarefa;

    public AtividadeConclusaoTarefa(Date dataHora, Tarefa tarefa) {
        super(dataHora, "Conclusão da tarefa: " + tarefa.getDescricao()); // chamando o construtor da superclasse com a descrição apropriada
        this.tarefa = tarefa;
        registrarAtividade(dataHora, "Conclusão da tarefa: " + tarefa.getDescricao()); // Registrando a atividade no histórico
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    // Método para exibir as atividades de conclusão no histórico
    public void mostrarHistoricoDeConclusao() {
        mostrarHistorico(); // Chama o método para mostrar o histórico na superclasse
    }
}
