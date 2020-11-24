package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos estudantes tem o curso A? ");

        int quantidadeAlunos = sc.nextInt();

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        for (int i = 0; i < quantidadeAlunos; i++) {
            int aluno = sc.nextInt();
            a.add(aluno);
        }

        System.out.print("Quantos estudantes tem o curso B? ");

        quantidadeAlunos = sc.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            int aluno = sc.nextInt();
            b.add(aluno);
        }

        System.out.print("Quantos estudantes tem o curso B? ");

        quantidadeAlunos = sc.nextInt();

        for (int i = 0; i < quantidadeAlunos; i++) {
            int aluno = sc.nextInt();
            c.add(aluno);
        }

        sc.close();
        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total de alunos: " + total.size());

    }

}
