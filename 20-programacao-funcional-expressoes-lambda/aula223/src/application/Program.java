package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.ProductService;

public class Program {

    public static int globalValue = 3;

    public static void main(String[] args) {

        ProductService ps = new ProductService();

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        // double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        double sum = ps.filteredSum(list, p -> p.getPrice() < 100);

        System.out.println("Soma: " + String.format("%.2f", sum));

    }

}
