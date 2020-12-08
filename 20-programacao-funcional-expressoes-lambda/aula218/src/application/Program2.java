package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program2 {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.0));
        list.add(new Product("Notebook", 1200.0));
        list.add(new Product("Tablet", 450.0));

        // passar uma função como argumento de outra, função de primeira ordem
        list.sort(Program2::compareProducts);

        // passar uma função como argumento de outra, função de primeira ordem
        list.forEach(System.out::println);

    }

    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

}
