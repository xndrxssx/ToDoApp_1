package Caracteristicas;

/**
 *
 * @author Luyza
 */
import java.util.ArrayList;
import java.util.List;

import Tarefas.ListaDeTarefas;

public class CategoriaDeListaDeTarefas extends Categoria {
    private List<ListaDeTarefas> listasDeTarefas;

    public CategoriaDeListaDeTarefas(String nome, String cor, String icone) {
        super(nome, cor, icone);
        this.listasDeTarefas = new ArrayList<>();
    }

    public void adicionarListaDeTarefas(ListaDeTarefas lista) {
        listasDeTarefas.add(lista);
    }

    public void removerListaDeTarefas(ListaDeTarefas lista) {
        listasDeTarefas.remove(lista);
    }

    // Exemplo de método para obter todas as listas de tarefas nesta categoria
    public List<ListaDeTarefas> getListasDeTarefas() {
        return listasDeTarefas;
    }
}