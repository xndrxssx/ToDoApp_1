package Agenda;

import Caracteristicas.Prioridade;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import Tarefas.ListaDeTarefas;
import Tarefas.Tarefa;
import Interfaces.todointerface;
import Tarefas.TarefaSimples;
import java.time.LocalDate;

public class Evento implements todointerface{
    private String titulo;
    private Date dataHora;
    private String descrição;
    private Date horario;
    private List<Evento> listaDeEventos; // Certifique-se de inicializar a lista

    public Evento() {
        this.listaDeEventos = new ArrayList<>(); // Inicializa a lista de eventos
    }
    
    public void adicionarEvento(Evento evento) {
        this.listaDeEventos.add(evento);
    }

    public Evento(Date horario) {
        this.horario = horario;
    }

    public Date getHorario() {
        return horario;
    }

    public Evento(String titulo, Date dataHora, String descrição) {
        this.titulo = titulo;
        this.dataHora = dataHora;
        this.descrição = descrição;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }
    
    public void verificarConflitosDeAgenda(Evento novoEvento) {
        Calendario calendario = new Calendario(); // Crie uma instância de Calendario
        boolean conflito = calendario.verificarConflito(listaDeEventos, novoEvento);

        if (conflito) {
            System.out.println("Há um conflito de agenda com o novo evento.");
        } else {
            System.out.println("Não há conflitos de agenda com o novo evento.");
        }
    }

    @Override
    public void marcarComoConcluida() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void add(TarefaSimples tarefa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editar(String novoTitulo, String novaDescricao, LocalDate novaDataDeVencimento, Prioridade novaPrioridade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDescricao() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
