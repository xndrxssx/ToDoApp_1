package Anexos;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class DocumentoAnexado extends Anexo {
	private int marginLeft;
    private int marginRight;
    private int marginTop;
    private int marginBottom;
    private StringBuilder conteudoDoDocumento = new StringBuilder();

    public DocumentoAnexado(String nome, String tipo, long tamanho, byte[] conteudo) {
        super(nome, tipo, tamanho, conteudo);
    }
    
    public boolean anexoValido() {
        return verificarFormato() && verificarTamanho() && verificarConteudo();
    }
    
    private boolean verificarFormato() {
        // Obtém o nome do arquivo do anexo
        String nomeArquivo = ((Anexo) this.anexo).getNome();

        // Obtém a extensão do arquivo
        String extensao = nomeArquivo.substring(nomeArquivo.lastIndexOf(".") + 1);

        // Valida a extensão do arquivo
        List<String> formatosValidos = Arrays.asList("pdf", "docx", "xlsx");
        if (!formatosValidos.contains(extensao)) {
            return false;
        }

        // Valida o tamanho do arquivo
        if (((Anexo) this.anexo).getTamanho() > 1000000) {
            return false;
        }

        // Retorna true se o formato for válido
        return true;
    }
    
    private boolean verificarTamanho() {
        // Obtém o tamanho do anexo
        int tamanho = (int) ((Anexo) this.anexo).getTamanho();

        // Valida o tamanho do arquivo
        int limite = 1000000; // 1 MB
        if (tamanho > limite) {
            return false;
        }

        // Retorna true se o tamanho estiver dentro dos limites
        return true;
    }
      
    public byte[] converterParaFormato(String novoFormato) throws Exception {
        byte[] novoConteudo = null;

        if (novoFormato.equals("pdf")) {
            novoConteudo = convertToPdf(conteudo);
        } else if (novoFormato.equals("txt")) {
            novoConteudo = convertToTxt(conteudo);
        }
        return novoConteudo;
    }

    // Exemplo de método de conversão para PDF
    private byte[] convertToPdf(byte[] content) throws Exception {
        // Cria um objeto PDF
        Anexo doc = new DocumentoAnexado(getNome(), getNome(), getTamanho(), content);

        // Adiciona o conteúdo do anexo ao PDF
        doc.add(content);

        // Configura as opções de formatação
        ((DocumentoAnexado) doc).setMargins(20, 20, 20, 20);
        
        // Salva o PDF
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ((DocumentoAnexado) doc).save(baos);

        // Retorna o conteúdo do PDF
        return baos.toByteArray();
    }
    
 // Exemplo de método de conversão para TXT
 	private byte[] convertToTxt(byte[] content) throws Exception {
 	    // Cria um buffer de saída
 	    ByteArrayOutputStream baos = new ByteArrayOutputStream();

 	    // Converte o conteúdo para texto
 	    String texto = new String(content, "UTF-8");

 	    // Formata o texto
 	    texto = texto.replaceAll("\n", "\r\n");
 	    texto = texto.replaceAll("\t", "  ");

 	    // Escreve o texto no buffer de saída
 	    baos.write(texto.getBytes("UTF-8"));

 	    // Retorna o conteúdo do texto
 	    return baos.toByteArray();
 	}


    protected void save(ByteArrayOutputStream baos) {
    	try (FileOutputStream fos = new FileOutputStream(getNome())) {
            baos.writeTo(fos);
        } catch (IOException e) {
            // Lidar com a exceção de IO
            e.printStackTrace();
        }
    }


    protected void setFont(Font font) {
    }


    protected void setMargins(int left, int right, int top, int bottom) {
        this.setMarginLeft(left);
        this.setMarginRight(right);
        this.setMarginTop(top);
        this.setMarginBottom(bottom);
    }


    protected void add(byte[] content) {   	
        if (getTipo().equals("txt")) {
            try {
                // Converte o conteúdo em formato de texto
                String texto = new String(content, "UTF-8");
                conteudoDoDocumento.append(texto);

                
                System.out.println("Conteúdo adicionado ao documento de texto: " + texto);
            } catch (IOException e) {
                // Lidar com a exceção de IO
            	System.out.println("Tipo de documento não suportado para adicionar conteúdo.");
            	e.printStackTrace();
            }
        } else {
            System.out.println("Tipo de documento não suportado para adicionar conteúdo.");
        }
    }
    
    public void imprimirConteudoDoDocumento() {
        System.out.println("Conteúdo do documento: " + conteudoDoDocumento.toString());
    }
    
    public void salvarConteudoDoDocumento() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getNome()))) {
            writer.write(conteudoDoDocumento.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public int getMarginLeft() {
		return marginLeft;
	}

	public void setMarginLeft(int marginLeft) {
		this.marginLeft = marginLeft;
	}

	public int getMarginRight() {
		return marginRight;
	}

	public void setMarginRight(int marginRight) {
		this.marginRight = marginRight;
	}

	public int getMarginTop() {
		return marginTop;
	}

	public void setMarginTop(int marginTop) {
		this.marginTop = marginTop;
	}

	public int getMarginBottom() {
		return marginBottom;
	}

	public void setMarginBottom(int marginBottom) {
		this.marginBottom = marginBottom;
	}

	@Override
	public boolean verificarConteudo() {
		// TODO Auto-generated method stub
		return false;
	}

    
}
