/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Historico;
import java.util.Date;
import Tarefas.Tarefa;
import Usuario.Usuario;

/**
 *
 * @author Luyza
 */
public class ConclusaoTarefa {
    private Tarefa tarefa;
    private Date dataHoraConclusao;
    private Usuario usuarioResponsavel;

    public ConclusaoTarefa(Tarefa tarefa, Date dataHoraConclusao, Usuario usuarioResponsavel) {
        this.setTarefa(tarefa);
        this.setDataHoraConclusao(dataHoraConclusao);
        this.setUsuarioResponsavel(usuarioResponsavel);
    }

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public Date getDataHoraConclusao() {
		return dataHoraConclusao;
	}

	public void setDataHoraConclusao(Date dataHoraConclusao) {
		this.dataHoraConclusao = dataHoraConclusao;
	}

	public Usuario getUsuarioResponsavel() {
		return usuarioResponsavel;
	}

	public void setUsuarioResponsavel(Usuario usuarioResponsavel) {
		this.usuarioResponsavel = usuarioResponsavel;
	}

}
