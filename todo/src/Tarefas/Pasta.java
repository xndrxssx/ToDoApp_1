/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarefas;
import Caracteristicas.Tag;
import java.util.ArrayList;
import java.util.List;

public class Pasta {
    private String nome;
    private List<Tarefa> tarefas;
    private List<ListaDeTarefas> listasDeTarefas;
    private Tag sistemaDeOrdenacao;

    public Pasta(String nome) {
        this.nome = nome;
        this.setTarefas(new ArrayList<>());
        this.listasDeTarefas = new ArrayList<>();
        this.sistemaDeOrdenacao = new Tag(nome, nome, nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        //implementar tarefas
    }

    public void adicionarListaDeTarefas(ListaDeTarefas lista) {
        listasDeTarefas.add(lista);
        //
    }

    public void ordenarPorCategoria() {
       
        }

	public Tag getSistemaDeOrdenacao() {
		return sistemaDeOrdenacao;
	}

	public void setSistemaDeOrdenacao(Tag sistemaDeOrdenacao) {
		this.sistemaDeOrdenacao = sistemaDeOrdenacao;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
    }


