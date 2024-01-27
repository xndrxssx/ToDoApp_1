package Tarefas;

import Caracteristicas.Tag;
import Caracteristicas.Prioridade;
import Caracteristicas.Localizacao;
import Caracteristicas.Categoria;
import Historico.ConclusaoTarefa;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import Caracteristicas.Status;
import java.time.LocalDate;

/**
 *
 * @author ALCC
 */
public abstract class Tarefa {
    
    protected String titulo;
    protected String descricao;
    protected LocalDate dataDeVencimento;
    protected Prioridade prioridade;
    private Date dataCriacao;
    private Date dataConclusao;
    private Status status; 
    private String responsavel;
    private String notas;
    private Date prazo;
    private Tag tag;
    private Categoria categoria;
    private Localizacao localizacao;
    private List<ConclusaoTarefa> conclusoes = new ArrayList<>();
    
    public Tarefa(String titulo, String descricao, LocalDate dataDeVencimento, Prioridade prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataDeVencimento = dataDeVencimento;
        this.prioridade = prioridade;
    }

    
    //mudar depois
    public Tarefa(String descricao) {
        this.descricao = descricao;
        //quais atributos primários a ser iniciados? o que valida a criação da tarefa? ex: não faz sentido criar
        //tarefa sem descricao ou titulo...
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    //conclusao
    public void adicionarConclusao(ConclusaoTarefa conclusao) {
        conclusoes.add(conclusao);
    }
    
    public abstract void realizar();

    public abstract boolean estaConcluida();

    public abstract void marcarComoConcluida();

    public abstract void editar(String novoTitulo, String novaDescricao, LocalDate novaDataDeVencimento, Prioridade novaPrioridade);
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
    

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataDeVencimento=" + dataDeVencimento +
                ", prioridade=" + prioridade +
                '}';
    }


	public Date getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Date getDataConclusao() {
		return dataConclusao;
	}


	public void setDataConclusao(Date dataConclusao) {
		this.dataConclusao = dataConclusao;
	}


	public Status getStatus() {
		return status;
	}


	public void setStatus(Status status) {
		this.status = status;
	}


	public String getResponsavel() {
		return responsavel;
	}


	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}


	public String getNotas() {
		return notas;
	}


	public void setNotas(String notas) {
		this.notas = notas;
	}


	public Date getPrazo() {
		return prazo;
	}


	public void setPrazo(Date prazo) {
		this.prazo = prazo;
	}


	public Tag getTag() {
		return tag;
	}


	public void setTag(Tag tag) {
		this.tag = tag;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Localizacao getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
    
}
