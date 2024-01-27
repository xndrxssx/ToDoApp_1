 package Tarefas;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luyza
 */
public class Projeto {
    private String nome;
    private Date dataInicio;
    private Date dataConclusao;
    private List<ListaDeTarefas> listasDeTarefas;

    public Projeto(String nome, Date dataInicio, Date dataConclusao) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
        this.listasDeTarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void adicionarListaDeTarefas(ListaDeTarefas lista) {
        listasDeTarefas.add(lista);
    }

    public void realizarTodasAsTarefasDoProjeto() {
        System.out.println("Realizando todas as tarefas do projeto: " + nome);
        for (ListaDeTarefas lista : listasDeTarefas) {
            lista.realizarTodasAsTarefas();
        }
    }
    
}
