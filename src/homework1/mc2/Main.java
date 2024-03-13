package homework1.mc2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa una frase");
        String frase = scanner.next();
        scanner.close();
        System.out.println(frase.length());
        System.out.println(frase.indexOf("a"));
        System.out.println(frase.toUpperCase());
        System.out.println(frase.substring(4));
        System.out.println(frase.concat("nueva cadena"));
    }
}
