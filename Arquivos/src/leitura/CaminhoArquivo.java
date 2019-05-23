package leitura;

import java.io.File;
import java.util.Scanner;

public class CaminhoArquivo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com a url de um arquivo! ");
		String urlArq = sc.nextLine();

		File url = new File(urlArq);
		
		System.out.println("getName: " + url.getName());	//Acessa somente o nome do arquivo
		System.out.println("getParent: " + url.getParent());	//Acessa somente o caminho do arquivo
		System.out.println("getPath: " + url.getPath());		//Acessa todo o caminho do arquivo com extensão

		sc.close();
	}

}
