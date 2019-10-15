package zadanie1;

import java.util.Scanner;

public class CalcTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Calculator calculator = new Calculator();
        System.out.println("Wprowadz dwie dowolne liczby");
        double a = keyboard.nextDouble();
        keyboard.nextLine();
        double b = keyboard.nextDouble();
        keyboard.close();
        calculator.calc(a, b);
        System.out.println(calculator.calc(a, b));
    }
}
