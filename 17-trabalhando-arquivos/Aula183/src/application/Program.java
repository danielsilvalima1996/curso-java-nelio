package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Produto> list = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite o caminho do arquivo: ");
		String strPath = sc.nextLine();

		File file = new File(strPath);
		String strParent = file.getParent();

		boolean sucesso = new File(strParent + "/out").mkdir();
		String caminhoArquivo = strParent + "/out/summary.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String descricao = fields[0];
				double preco = Double.parseDouble(fields[1]);
				int quantidade = Integer.parseInt(fields[2]);
				list.add(new Produto(descricao, preco, quantidade));
				line = br.readLine();
			}

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {

				for (Produto item : list) {
					bw.write(item.getDescricao() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
				}

				System.out.println(caminhoArquivo + " CRIADO!");
			} catch (IOException e) {
				System.out.println("Error ao criar o arquivo: " + e.getMessage());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File path = new File(strPath);

		System.out.println("getPath: " + path.getPath());

		sc.close();

	}

}
