/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Caracteristicas;

/**
 *
 * @author Luyza
 */
public class Status {
    //public static final porque quero que seja global e constante, imutável
    public static final String PENDENTE = "Pendente";
    public static final String EM_ANDAMENTO = "Em Andamento";
    public static final String CONCLUIDA = "Concluída";
    public static final String CANCELADA = "Cancelada";
    
    
    //construtor privado para evitar a instanciação da classe
    private Status() {
    }
}
