package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> items = new LinkedHashMap<>();

            String line = br.readLine();

            while (line != null) {

                String[] fields = line.split(",");
                String nome = fields[0];
                Integer quantidade = Integer.parseInt(fields[1]);

                if (items.containsKey(nome)) {
                    items.put(nome, quantidade += items.get(nome));
                } else {
                    items.put(nome, quantidade);
                }

                line = br.readLine();
            }

            for (String key : items.keySet()) {
                System.out.println(key + ": " + items.get(key));
            }

        } catch (IOException e) {
            // TODO: handle exception
        }

        sc.close();

    }

}
