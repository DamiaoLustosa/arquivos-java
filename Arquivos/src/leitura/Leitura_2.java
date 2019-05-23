package leitura;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Trabalhando com try-with-resources
/*Try-with-resources declara um ou mais recursos
 * e garante que esses recursos ser�o fechados ao final da execu��o do bloco.
 */


public class Leitura_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "C:\\Users\\Fam�lia Lustosa\\Documents\\in.txt";

		//Declarando as variaveis dentro do bloco try
		// e Passando-as como argumentos no bloco try
		try (BufferedReader br = new BufferedReader(new FileReader(url))) {

			String linha = br.readLine(); // L� uma linha. Retorna null ap�s a leitura da �ltima linha

			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();

			}

		}

		catch (IOException e) {
			System.out.println("Error :" + e.getMessage());
		}

	}

}
