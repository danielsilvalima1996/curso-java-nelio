package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            List<Funcionario> list = new ArrayList<>();

            while (line != null) {
                
                String [] fields = line.split(",");

                list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();
            }

            System.out.print("Digite o salário: ");
            double salario = sc.nextDouble();

            List<String> emails = list.stream()
                                .filter(f -> f.getSalario() > salario)
                                .map(f -> f.getEmail())
                                .sorted()
                                .collect(Collectors.toList());

            System.out.println("E-mails da pessoas cujo o salário seja maiores que " + String.format("%.2f", salario) +  ": ");

            emails.forEach(System.out::println);

            double soma = list.stream()
                            .filter(f -> f.getNome().toLowerCase().charAt(0) == 'm')
                            .map(f -> f.getSalario())
                            .reduce(0.0, (f1, f2) -> f1 + f2);

            System.out.println("Soma dos salários das pessoas cujo o nome comece com 'M': " + String.format("%.2f", soma));
            
        } catch (Exception e) {
            //TODO: handle exception
        }

        sc.close();

    }
    
}
