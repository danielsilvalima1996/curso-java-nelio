package application;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // ? é o tipo any de qualquer tipo
        // List<?> myObjs = new ArrayList<Object>();
        // List<Integer> myNumbers = new ArrayList<Integer>();
        // myObjs = myNumbers;

        // Object obj;
        // Integer x = 10;
        // obj = x;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStr = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStr);

    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}