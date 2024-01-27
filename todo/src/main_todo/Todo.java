package main_todo;
import Tarefas.ListaDeTarefas;
import Tarefas.Tarefa;
import Tarefas.TarefaSimples;
import Caracteristicas.Prioridade;
import Anexos.Anotacao;
import Anexos.AnotacaoTarefa;
import Anexos.DocumentoAnexado;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Agenda.Alarme;
import Agenda.Calendario;
import Agenda.Lembrete;
import java.io.IOException;
import java.time.LocalDate;


/**
 *
 * @author ALCC
 */
public class Todo {
    
    @Override
    public String toString() {
        return "Testando"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
  

   public static void main(String[] args) {
        // TODO code application logic here
        Todo to = new Todo();
        Todo to_2 = new Todo();
        System.out.println(to.toString());
        System.out.println(to_2.toString());
        
//---------teste de polimorfismo entre a lista de tarefas e lista de tarefas prioritárias--------------------------
        List<ListaDeTarefas> listaDeListas = new ArrayList<>();
        
        //adicione objetos de ambas as classes à lista
        listaDeListas.add(new ListaDeTarefas("Minha Lista"));
        listaDeListas.add(new Prioridade("Minha Lista Prioritária"));

        //iterando sobre a lista e chamando métodos polimórficos
        for (ListaDeTarefas lista : listaDeListas) {
            System.out.println("Nome da Lista: " + lista.getNome());
            lista.realizarTodasAsTarefas();
            
            // Verifique se a lista é do tipo ListaDeTarefasComPrioridade
            if (lista instanceof Prioridade) {
                Prioridade listaPrioritaria = (Prioridade) lista;
                System.out.println("Esta é uma Lista de Tarefas com Prioridade.");
                listaPrioritaria.realizarTodasAsTarefasComPrioridade();
            }
        }
//---------------------------------------fim do teste de polimorfismo-------------------------------------------

//---------------------------------------teste de arquivo-------------------------------------------
    try 
    {       
            // Suponha que o tamanho do arquivo seja 1000 bytes e o conteúdo seja um array de bytes correspondente
            long tamanho_do_arquivo = 1000; // Substitua 1000 pelo tamanho real do arquivo
            byte[] conteudo_do_arquivo = new byte[1000]; // Substitua o array de bytes pelo conteúdo real do arquivo

            
            DocumentoAnexado arquivo = new DocumentoAnexado("nome_arquivo", "tipo_arquivo", tamanho_do_arquivo, conteudo_do_arquivo);
            byte[] conteudo = arquivo.lerConteudoDoArquivo();

            
            // Faça algo com o conteúdo do arquivo (por exemplo, exiba-o)
            System.out.println(new String(conteudo)); // Supondo que o arquivo seja texto
        } catch (IOException e) {
            e.printStackTrace();
        }
    //---------------------------------------fim teste de arquivo-------------------------------------------   
    
   // -------------------------------------------CALENDARIO-----------------------------------
    
    Calendario meuCalendario = new Calendario();

    // Exemplo de criação de um lembrete e adição ao calendário
    Lembrete lembrete = new Lembrete("Reunião importante", new Date());
    meuCalendario.adicionarLembrete(lembrete);

    // Exemplo de exibição dos lembretes agendados
    for (Lembrete l : meuCalendario.lembretes) {
        System.out.println("Lembrete: " + l.getMensagem() + " - Data: " + l.formatarDataHora());
    }
    
    //------------------------------------------FIM CALENDARIO--------------------------
 
    // Crie uma instância de Alarme e forneça a data e a mensagem desejada
    Date horario = new Date(); // Forneça a data e hora desejadas
    String mensagem = "Hora de Acordar!";

    Alarme alarme = new Alarme(horario, mensagem);

    // Chame os métodos conforme necessário para agendar, desativar ou imprimir detalhes do alarme
    alarme.agendar(horario);
    alarme.printDetalhes();
    alarme.desativarAlarme();

    Prioridade Status = null;
	// Exemplo de criação de um objeto Tarefa
    Tarefa tarefa = new TarefaSimples("Comprar mantimentos", "Ir ao supermercado comprar mantimentos", null, Status);

    // Exemplo de impressão dos detalhes da tarefa
    System.out.println("Detalhes da tarefa:");
    System.out.println(tarefa);

    // Exemplo de realização de uma tarefa
    tarefa.realizar();

    // Exemplo de marcação da tarefa como concluída
    tarefa.marcarComoConcluida();
    
    String caminhoArquivo1 = "anotacao1.txt";
    AnotacaoTarefa anotacao1 = new AnotacaoTarefa(tarefa, "Exemplo de anotação 1", horario);
    anotacao1.salvarAnotacao(caminhoArquivo1);
    System.out.println("Número de palavras na anotação: " + anotacao1.contarPalavras());
    System.out.println("Número de caracteres na anotação: " + anotacao1.contarCaracteres());
    System.out.println("Anotação salva em: " + anotacao1.formatarDataCriacao());

    String caminhoArquivo2 = "anotacao2.txt";
    AnotacaoTarefa anotacao2 = new AnotacaoTarefa(tarefa, "Exemplo de anotação 2", horario);
    anotacao2.salvarAnotacao(caminhoArquivo2);
    System.out.println("Número de palavras na anotação: " + anotacao2.contarPalavras());
    System.out.println("Número de caracteres na anotação: " + anotacao2.contarCaracteres());
    System.out.println("Anotação salva em: " + anotacao2.formatarDataCriacao());

    // Carregar a anotação do arquivo
    System.out.println("Conteúdo da anotação carregada:");
    System.out.println(anotacao2.carregarAnotacao(caminhoArquivo2));
   
    byte[] conteudo = "Conteúdo de exemplo para o documento".getBytes();
    DocumentoAnexado documento = new DocumentoAnexado("meu_documento.txt", "txt", 200, conteudo);

    if (documento.anexoValido()) {
        System.out.println("Anexo válido.");
    } else {
        System.out.println("Anexo inválido.");
    }

    try {
        byte[] novoConteudoPDF = documento.converterParaFormato("pdf");
        System.out.println("Conteúdo convertido para PDF com sucesso.");

        byte[] novoConteudoTXT = documento.converterParaFormato("txt");
        System.out.println("Conteúdo convertido para TXT com sucesso.");
    } catch (Exception e) {
        e.printStackTrace();
    }

    documento.imprimirConteudoDoDocumento();
    documento.salvarConteudoDoDocumento();
   
   }//fim da main
   
   
     public static void realizarTodasAsTarefas(List<ListaDeTarefas> listaDeListas) {
        for (ListaDeTarefas tarefa : listaDeListas) {
            tarefa.realizarTodasAsTarefas();
        }
   }

}


