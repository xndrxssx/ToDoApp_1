package Agenda;
import java.util.Date;
import Tarefas.ListaDeTarefas;
import Tarefas.Tarefa;

public abstract class Notificacao {
    
    // Construtor para criar uma notificação com mensagem e data de criação
    public Notificacao(String mensagem, Date date) {
        this.setMensagem(mensagem, date);
        new Date();
    }

	public abstract void agendar(Date dataHora);
    
    public abstract void enviarNotificacao(); 

    // Métodos para acessar informações da notificação
    public abstract String getMensagem();

    // Métodos para associar a notificação a uma tarefa ou lista de tarefas (opcional)
    public abstract void associarTarefa(Tarefa tarefa) ;

    public abstract void associarListaDeTarefas(ListaDeTarefas lista);

	public void setMensagem(String mensagem, Date date) {
	} 

}