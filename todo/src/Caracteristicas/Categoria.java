/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caracteristicas;

import java.util.regex.Pattern;

/**
 *
 * @author ALCC
 */
public abstract class Categoria{
    private String nome;
    private String cor;
    private String icone;

    public Categoria(String nome, String cor, String icone) {
        if (validarNome(nome)) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome de categoria inválido");
        }
        if (validarCor(cor)) {
            this.cor = cor;
        } else {
            throw new IllegalArgumentException("Cor inválida");
        }
        this.icone = icone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (validarNome(nome)) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome de categoria inválido");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (validarCor(cor)) {
            this.cor = cor;
        } else {
            throw new IllegalArgumentException("Cor inválida");
        }
    }

    public String getIcone() {
        return icone;
    }

    public void setIcone(String icone) {
        this.icone = icone;
    }

    private boolean validarNome(String nome) {
        // Adicione sua lógica de validação do nome aqui
        return nome != null && !nome.trim().isEmpty();
    }

    private boolean validarCor(String cor) {
        // Adicione sua lógica de validação da cor aqui, pode ser um código de verificação de formato de cor
        String corPadrao = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$"; // padrão de cor hexadecimal
        return Pattern.matches(corPadrao, cor);
    }

  }

