/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Luyza
 */
public class ConfiguracoesDoUsuario {
    private boolean notificacoesAtivadas;
    private String temaDaInterface;
    private String idioma;

    public ConfiguracoesDoUsuario(boolean notificacoesAtivadas, String temaDaInterface, String idioma) {
        this.setNotificacoesAtivadas(notificacoesAtivadas);
        this.setTemaDaInterface(temaDaInterface);
        this.setIdioma(idioma);
    }

	public boolean isNotificacoesAtivadas() {
		return notificacoesAtivadas;
	}

	public void setNotificacoesAtivadas(boolean notificacoesAtivadas) {
		this.notificacoesAtivadas = notificacoesAtivadas;
	}

	public String getTemaDaInterface() {
		return temaDaInterface;
	}

	public void setTemaDaInterface(String temaDaInterface) {
		this.temaDaInterface = temaDaInterface;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
}
