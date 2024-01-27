/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author ALCC
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;

    // Construtor para criar um objeto de usuário
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    // Métodos para acessar informações do usuário
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // Você pode adicionar métodos adicionais conforme necessário

    // Método para verificar se a senha está correta (simplificado)
    public boolean verificarSenha(String senhaDigitada) {
        return senha.equals(senhaDigitada);
    }
    
}
