/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Anexos;

import java.io.IOException;


/**
 *
 * @author ALCC
 */
public abstract class Anexo {
    private String nome;
    private String tipo;
    private long tamanho;
    public byte[] conteudo;
	public Object anexo;
    
    public Anexo(String nome, String tipo, long tamanho, byte[] conteudo) {
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.conteudo = conteudo;
    }

    public void escreverConteudoNoArquivo(byte[] novoConteudo) {
        this.conteudo = novoConteudo;
        this.tamanho = novoConteudo.length;
    }

    public boolean anexoVazio() {
        return tamanho == 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public long getTamanho() {
        return tamanho;
    }

    public void setTamanho(long tamanho) {
        this.tamanho = tamanho;
    }

    public byte[] getConteudo() {
        return conteudo;
    }

    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }
    
    public byte[] lerConteudoDoArquivo() throws IOException {
        return conteudo;
    }
    
    public abstract boolean verificarConteudo();

	protected void add(byte[] content) {
		// TODO Auto-generated method stub
		
	}
	
    
}
