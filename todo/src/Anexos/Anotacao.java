package Anexos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class Anotacao {
    private String texto;
    private Date dataCriacao;

    public Anotacao(String texto) {
        this.texto = texto;
        this.dataCriacao = new Date(); // Define a data de criação como a data atual
    }

    // Métodos para manipulação do texto da anotação
    public void editarAnotacao(String novoTexto) {
        this.texto = novoTexto;
    }

    // Método para formatar a data de criação de forma legível
    public String formatarDataCriacao() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return formatador.format(dataCriacao);
    }

    // Método para salvar a anotação em um arquivo
    public void salvarAnotacao(String caminhoArquivo) {
        try {
            File file = new File(caminhoArquivo);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(this.texto);
            writer.close();
            System.out.println("Anotação salva com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
        // Método para carregar a anotação de um arquivo
    public String carregarAnotacao(String caminhoArquivo) {
        try {
            File file = new File(caminhoArquivo);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String line = reader.readLine();
            while (line != null) {
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
                line = reader.readLine();
            }
            reader.close();
            System.out.println("Anotação carregada com sucesso!");
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    // Método para obter o número de palavras na anotação
    public int contarPalavras() {
        String[] palavras = texto.split("\\s+");
        return palavras.length;
    }

    // Método para obter o número de caracteres na anotação
    public int contarCaracteres() {
        return texto.length();
    }

    // Getters e Setters para texto e data de criação
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getTexto() {
        return texto;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }
}