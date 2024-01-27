package Anexos;
import java.util.Date;
import Tarefas.Tarefa;

public class AnotacaoTarefa extends Anotacao {
    private Tarefa tarefa;

    public AnotacaoTarefa(Tarefa tarefa, String texto, Date dataCriacao) {
        super(texto);
        this.tarefa = tarefa;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
    
    
}
