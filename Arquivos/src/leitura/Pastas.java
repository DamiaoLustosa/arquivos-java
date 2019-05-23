package leitura;

import java.io.File;
import java.util.Scanner;

public class Pastas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com a url de uma pasta! ");
		String urlPasta = sc.nextLine();
		
		File url = new File(urlPasta);	//File pode ser tanto o caminho de uma arquivo quanto o caminho de uma pasta
		
		File pastas[] = url.listFiles(File::isDirectory);	//Essa expressão lista somente os diretorios
		System.out.println("DIRETORIOS: ");
		
		for (File pasta : pastas) {	//ForEach é pra ser trabalhado com cunjuntos (vetores, listas, mapas...);
			System.out.println(pasta);
			
		}
		
		
		File arq[] = url.listFiles(File::isFile);	//Essa expressão lista somente os arquivos
		System.out.println("ARQUIVOS: ");
		
		for (File arquivo : arq) {	//ForEach é pra ser trabalhado com cunjuntos (vetores, listas, mapas...);
			System.out.println(arquivo);
			
		}
		
		boolean suces = new File(urlPasta + "\\PastaTEste").mkdir();	//Comando para criar subpasta no diretorio informado
		System.out.println("Diretorio criado com sucesso! "+ suces);
		
		
		
		sc.close();		

	}

}
