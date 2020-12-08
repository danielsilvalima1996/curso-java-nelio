package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            List<Product> list = new ArrayList<>();

            while (line != null) {

                String[] fields = line.split(",");

                list.add(new Product(fields[0], Double.parseDouble(fields[1])));

                line = br.readLine();
            }

            double media = list.stream()
                            .map(x -> x.getPrice())
                            .reduce(0.0, (a, b) -> a + b) / list.size();

            System.out.printf("Preço médio: %.2f \n", media);

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2);

            List<String> names = list.stream()
                                .filter(p -> p.getPrice() < media)
                                .map(p -> p.getName())
                                .sorted(comp.reversed())
                                .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            // TODO: handle exception
        }

        sc.close();

    }

}
