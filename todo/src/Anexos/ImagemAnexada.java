package Anexos;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Luyza
 */
public class ImagemAnexada extends Anexo {
	private BufferedImage imagem;
	private int largura;
	private int altura;
    
    public ImagemAnexada(String nome, long tamanho, byte[] conteudo) {
        super(nome, "Imagem", tamanho, conteudo);
    }
    
    public ImagemAnexada(String nome, String tipo, long tamanho, byte[] conteudo, int largura, int altura) {
        super(nome, tipo, tamanho, conteudo);
        this.setLargura(largura);
        this.setAltura(altura);
    }
    
    public void exibirImagem() {
        // Lógica para exibir a imagem
    }

    public boolean verificarConteudo() {
        if (conteudo != null && conteudo.length > 0) {
            // Verifica se o conteúdo não é nulo e tem um comprimento maior que zero
            // Outras verificações específicas podem ser adicionadas aqui, dependendo do tipo de anexo

            // Exemplo adicional de verificação específica para o tipo de anexo de imagem
            if (this instanceof ImagemAnexada) {
                // Verifica se o conteúdo é uma imagem válida
            	try {
                    // Tenta criar uma imagem a partir do conteúdo
                    ByteArrayInputStream inputStream = new ByteArrayInputStream(conteudo);
                    ImageIO.read(inputStream);
                    // Se a imagem for lida com sucesso, consideramos o conteúdo uma imagem válida
                    return true;
                } catch (IOException e) {
                    // Se ocorrer uma exceção ao tentar ler a imagem, consideramos o conteúdo inválido
                    return false;
                }
            }

            return true; // Retorna verdadeiro se todas as verificações forem bem-sucedidas
        } else {
            return false; // Retorna falso se o conteúdo for nulo ou vazio
        }
    }

	public BufferedImage getImagem() {
		return imagem;
	}

	public void setImagem(BufferedImage imagem) {
		this.imagem = imagem;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
    
}
