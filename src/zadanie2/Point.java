package zadanie2;

import java.util.Scanner;

public class Point {

    public void quarter(double x, double y) {
        String num = null;
        if (x > 0 && y > 0) {
            num = "I";
        } else if (x > 0 && y < 0) {
            num = "II";
        } else if (x < 0 && y < 0) {
            num = "III";
        } else if (x < 0 && y > 0) {
            num = "IV";
        } else {
            System.out.println("Punkt (0,0) znajduje sie w poczatku ukladu wspolrzednych");
        }
        if (num != null) {
            System.out.println("Punkt(" + x + "; " + y + ") lezy w " + num + " cwiartce ukladu wspolrzednych");
        }
    }
}
