package leitura;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


//Trabalhando com a escrita de arquivos
//Usando as classes FileWriter e BufferedWriter

public class EscritaArquivo {
	public static void main(String args[]) {

		String linhas[] = new String[] { "Bom dia", "Boa tarde", "Boa noite" };
		String urlEscrita = "C:\\Users\\Família Lustosa\\Documents\\out.txt";	//Diretorio a ser escrito

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(urlEscrita, true))) {	//Acrescenta o texto ao final
			for (String novaLlinha : linhas) {
				bw.write(novaLlinha);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// FileWiret(nomeArquivo) --> depois da primeira execução sobrescreve o arquivo
	// FileWiret(nomeArquivo, true) --> com o parametro 'true' e ele acrescenta o texto ao final do arquivo

}
