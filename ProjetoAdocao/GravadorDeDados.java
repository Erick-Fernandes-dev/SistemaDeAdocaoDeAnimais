package ProjetoAdocao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GravadorDeDados {

	public List<String> recuperaTextoEmArquivo(String nomeArquivo) throws IOException {
		List<String> linhasLidas = new ArrayList<String>();
		BufferedReader leitor = null;

		try {

			leitor = new BufferedReader(new FileReader(nomeArquivo));
			String linha = null;

			do {
				linha = leitor.readLine();
				if (linha != null) {
					linhasLidas.add(linha);
				}
			} while (linha != null);

		} finally {
			if (leitor != null) {
				leitor.close();
			}
		}
		return linhasLidas;
	}

	public void gravaTextoEmArquivo(List<String> texto, String nomeArquivo) throws IOException {

		BufferedWriter escritor = null;
		try {
			escritor = new BufferedWriter(new FileWriter(nomeArquivo));
			for (String s : texto) {
				escritor.write(s + "\n");
			}
		} finally {
			if (escritor != null) {
				escritor.close();
			}
		}
	}

}