package Agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class Calendario {
    private List<Evento> eventos;
    public List<Lembrete> lembretes;
    private Calendar calendar;
    
    public Calendario() {
    	this.eventos = new ArrayList<>();
        this.lembretes = new ArrayList<>();
        this.calendar = Calendar.getInstance(); // Inicialização do calendário com a data e hora atuais
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public void adicionarLembrete(Lembrete lembrete) {
        this.lembretes.add(lembrete); // Adiciona o lembrete à lista de lembretes do calendário
    }

    public List<Lembrete> getLembretes() {
        return lembretes;
    }
    
    // Adicionar um novo evento
    public void adicionarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    // Remover um evento existente
    public void removerEvento(Evento evento) {
        this.eventos.remove(evento);
    }

    public void setLembretes(List<Lembrete> lembretes) {
        this.lembretes = lembretes;
    }
      
    public boolean verificarConflito(List<Evento> eventos, Evento novoEvento) {
        for (Evento evento : eventos) {
            if (evento.getHorario().equals(novoEvento.getHorario())) {
                return true; // Existe um conflito de agenda
            }
        }
        return false; // Não há conflitos de agenda
    }
    
    public void definirData(int ano, int mes, int dia) {
        this.calendar.set(ano, mes - 1, dia); // Configura a data no calendário
    }

    public void avancarUmDia() {
        this.calendar.add(Calendar.DAY_OF_MONTH, 1); // Avança o calendário em um dia
    }

    public void retrocederUmDia() {
        this.calendar.add(Calendar.DAY_OF_MONTH, -1); // Retrocede o calendário em um dia
    }

    public void mostrarDataAtual() {
        System.out.println("Data atual: " + this.calendar.getTime());
    }
    
    public static void main(String[] args) {
        Calendario meuCalendario = new Calendario();

        meuCalendario.mostrarDataAtual();

        meuCalendario.avancarUmDia();
        meuCalendario.mostrarDataAtual();

        meuCalendario.retrocederUmDia();
        meuCalendario.mostrarDataAtual();
    }
   
}
