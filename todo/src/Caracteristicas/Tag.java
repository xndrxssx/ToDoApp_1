package Caracteristicas;

import java.util.ArrayList;
import java.util.List;

public class Tag {
    private String nome;
    private String cor;
    private String icone;
    private List<Categoria> categorias;

    public Tag(String nome, String cor, String icone) {
        this.nome = nome;
        this.cor = cor;
        this.icone = icone;
        this.categorias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void adicionarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void removerCategoria(Categoria categoria) {
        categorias.remove(categoria);
    }
    
 // Método para obter todas as categorias associadas a esta tag
    public List<Categoria> obterTodasCategorias() {
        return categorias;
    }
    
}
