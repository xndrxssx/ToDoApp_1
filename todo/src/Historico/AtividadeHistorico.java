package Historico;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luyza
 */
public class AtividadeHistorico {
	private Date dataHora;
    private String descricao;
    private List<AtividadeHistorico> historico;

    public AtividadeHistorico(Date dataHora, String descricao) {
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

	public List<AtividadeHistorico> getHistorico() {
		return historico;
	}

	public void setHistorico(List<AtividadeHistorico> historico) {
		this.historico = historico;
	}
	
	public AtividadeHistorico() {
        this.historico = new ArrayList<>();
    }

    public void adicionarAtividade(AtividadeHistorico atividade) {
        historico.add(atividade);
    }

    public void removerAtividade(AtividadeHistorico atividade) {
        historico.remove(atividade);
    }

    public void mostrarHistorico() {
    	List<AtividadeHistorico> atividadesConclusao = new ArrayList<>();
        List<AtividadeHistorico> atividadesCriacao = new ArrayList<>();

        for (AtividadeHistorico atividade : historico) {
            if (atividade.getDescricao().contains("Conclusão")) {
                atividadesConclusao.add(atividade);
            } else {
                atividadesCriacao.add(atividade);
            }
        }

        System.out.println("Atividades de Conclusão:");
        for (AtividadeHistorico atividade : atividadesConclusao) {
            System.out.println("Data e hora: " + atividade.getDataHora() + ", Descrição: " + atividade.getDescricao());
        }

        System.out.println("Atividades de Criação:");
        for (AtividadeHistorico atividade : atividadesCriacao) {
            System.out.println("Data e hora: " + atividade.getDataHora() + ", Descrição: " + atividade.getDescricao());
        }
    }

    // Método para registrar atividades no histórico
    public void registrarAtividade(Date dataHora, String descricao) {
        AtividadeHistorico atividade = new AtividadeHistorico(dataHora, descricao);
        adicionarAtividade(atividade);
    }
}
