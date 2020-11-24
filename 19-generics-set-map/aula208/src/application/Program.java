package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {

        // HashSet o mais rápido, porém não ordena a lista
        // Set<String> set = new HashSet<>();

        // TreeSet não tão rápido, mas ordena a lista
        // Set<String> set = new TreeSet<>();

        // LinkedHash mantém a ordena de inserção
        Set<String> set = new LinkedHashSet<>();

        set.add("Tv");
        set.add("Tablet");
        set.add("Notebook");

        // System.out.println("Existem o elemento 'Notebook': " + set.contains("Notebook"));

        // set.remove("Tablet");

        // set.removeIf(item -> item.length() >= 3);
        set.removeIf(item -> item.charAt(0) == 'T');

        for (String p : set) {
            System.out.println(p);
        }

    }

}
