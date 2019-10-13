package zadanie1;

import java.util.Scanner;

public class Calculator {
    Scanner keyboard = new Scanner(System.in);

    public double calc() {
        double result;
        System.out.println("Wprowadz pierwsza liczbe");
        double a = keyboard.nextDouble();
        System.out.println("Wprowadz druga liczbe");
        double b = keyboard.nextDouble();
        if (a < b) {
            result =a * b;
        } else if (a > b) {
            result = a + b;
        } else {
            result = a * a;
        }
        System.out.println(result);
        return result;
    }

}
