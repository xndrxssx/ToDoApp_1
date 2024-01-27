package Caracteristicas;

import java.time.LocalDate;

import Tarefas.Tarefa;

/**
 *
 * @author ALCC
 */
public class Localizacao extends Tarefa{
	private String nomeLocal;

    public Localizacao(String nomeLocal) {
        super(nomeLocal);
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

	@Override
	public void realizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean estaConcluida() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void marcarComoConcluida() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(String novoTitulo, String novaDescricao, LocalDate novaDataDeVencimento,
			Prioridade novaPrioridade) {
		// TODO Auto-generated method stub
		
	}

}
