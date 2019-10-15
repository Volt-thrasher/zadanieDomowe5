package zadanie2;

import java.util.Scanner;

public class Point {

    public String quarter(double x, double y) {
        String num = null;
        if (x > 0 && y > 0) {
            num = "Punkt(" + x + "; " + y + ") lezy w I cwiartce ukladu wspolrzednych";
        } else if (x > 0 && y < 0) {
            num = "Punkt(" + x + "; " + y + ") lezy w II cwiartce ukladu wspolrzednych";
        } else if (x < 0 && y < 0) {
            num = "Punkt(" + x + "; " + y + ") lezy w III cwiartce ukladu wspolrzednych";
        } else if (x < 0 && y > 0) {
            num = "Punkt(" + x + "; " + y + ") lezy w IV cwiartce ukladu wspolrzednych";
        } else {
            num = "Punkt (0,0) znajduje sie w poczatku ukladu wspolrzednych";
        }
        return num;
    }
}
