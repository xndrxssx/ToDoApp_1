package Interfaces;
import Caracteristicas.Prioridade;
import java.util.Date;

import Tarefas.ListaDeTarefas;
import Tarefas.Tarefa;
import Tarefas.TarefaRecorrente;
import Tarefas.TarefaSimples;
import java.time.LocalDate;

public interface todointerface {

   public void marcarComoConcluida();
   public void add(TarefaSimples tarefa);
   public void editar(String novoTitulo, String novaDescricao, LocalDate novaDataDeVencimento,Prioridade novaPrioridade);
   public String getDescricao();
   public String getTitulo();
   
   
}
