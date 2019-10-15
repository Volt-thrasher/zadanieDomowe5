package zadanie1;

import java.util.Scanner;

public class Calculator {

    public double calc(double a, double b) {
        double result;
        if (a < b) {
            result = a * b;
        } else if (a > b) {
            result = a + b;
        } else {
            result = a * a;
        }
        return result;
    }

}
