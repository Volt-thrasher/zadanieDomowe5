package zadanie1;

import java.util.Scanner;

public class Calculator {
    Scanner keyboard = new Scanner(System.in);

    public void calc() {
        System.out.println("Wprowadz pierwsza liczbe");
        double a = keyboard.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        double b = keyboard.nextDouble();
        if (a < b) {
            System.out.println(a * b);
        } else if (a > b) {
            System.out.println(a + b);
        } else {
            System.out.println(a * a);
        }
    }

}
