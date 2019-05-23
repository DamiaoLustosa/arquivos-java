package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


//Trabalhando com as classes FileReader e BufferedReader
public class LeituraArquivo {
	public static void main (String args[]) {
		String url = "C:\\Users\\Família Lustosa\\Documents\\in.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader (url);
			br = new BufferedReader (fr);
			
			String linha = br.readLine();	//Lê uma linha. Retorna null após a leitura da última linha
			
			while (linha !=null) {
				System.out.println(linha);
				linha = br.readLine();
				
			}
			
		}
		
		catch (IOException e) {
			System.out.println("Error :" + e.getMessage());
		}
		
		finally {
			try {
				if (fr != null) {
					fr.close();
				}
				
				if (br != null) {
					br.close();
				}
			}
			
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
