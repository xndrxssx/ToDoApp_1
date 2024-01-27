package Agenda;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import Tarefas.ListaDeTarefas;
import Tarefas.Tarefa;

/**
 *
 * @author ALCC
 */
public class Alarme extends Notificacao {
    private String mensagem;
    private Date horario;
    private boolean ativado;

   
    
    // Método para validar o horário do alarme
    private boolean validarHorario(Date horario) {
        Date dataAtual = new Date(); // Obtém a data e hora atuais
        return horario.after(dataAtual); // Verifica se o horário definido é posterior à hora atual
    }
    
    public Alarme(Date horario, String mensagem) {
        super(mensagem, horario); // Chama o construtor da classe base Notificacao
        this.horario = horario;
        this.mensagem = mensagem;
        validarHorario(horario);
    }

    public Date getHorario() {
        return horario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }
    
    // Função para imprimir detalhes do Alarme
    public void printDetalhes() {
        System.out.println("Horário do alarme: " + horario);
        System.out.println("Mensagem do alarme: " + mensagem);
    }
    
    // Método para ativar o alarme
    public void agendar(Date dataHora) {
    	 Timer timer = new Timer();
         TimerTask tarefa = new TimerTask() {
             @Override
             public void run() {
                 enviarNotificacao();
             }
         };
         timer.schedule(tarefa, dataHora);
         System.out.println("Notificação agendada para: " + dataHora);
    }
    
    // Método para desativar o alarme
    public void desativarAlarme() {
        if (ativado) {
            ativado = false;
            System.out.println("Alarme desativado. Parando o alarme..."); // Simulação de parada do alarme
        } else {
            System.out.println("O alarme já está desativado.");
        }
    }  

    // Métodos para persistência
    public void salvarAlarme() {
    // Lógica para salvar o alarme em um banco de dados ou arquivo
    try {
        // Simulação de salvamento
        System.out.println("Salvando o alarme...");
        // Lógica de salvamento aqui
        System.out.println("Alarme salvo com sucesso!");
    } catch (Exception e) {
        System.out.println("Erro ao salvar o alarme: " + e.getMessage());
    }    
}

	@Override
	public void enviarNotificacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void associarTarefa(Tarefa tarefa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void associarListaDeTarefas(ListaDeTarefas lista) {
		// TODO Auto-generated method stub
		
	}  
}
