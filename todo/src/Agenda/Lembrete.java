package Agenda;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

import Tarefas.ListaDeTarefas;
import Tarefas.Tarefa;


public class Lembrete extends Notificacao {
    private String mensagem;
    private Date dataHora;
    
    public Lembrete(String mensagem, Date date) {
		super(mensagem, date);
		// TODO Auto-generated constructor stub
	}    

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }
    
    // Método para formatar a data e hora de forma legível
    public String formatarDataHora() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatador.format(dataHora);
    }
    
    // Método para verificar se o lembrete está programado para um momento no futuro
    public boolean isFuturo() {
        Date dataAtual = new Date();
        return dataHora.after(dataAtual);
    }
    
      
    public void agendar(Date dataHora) {
        Timer timer = new Timer();
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                enviarNotificacao1();
            }
        };
        timer.schedule(tarefa, dataHora);
        System.out.println("Notificação agendada para: " + dataHora);
    }
    
    public void enviarNotificacao1() {
        System.out.println("Notificação: " + mensagem); // Exemplo de lógica de notificação simples
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
