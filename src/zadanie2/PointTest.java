package zadanie2;

import java.util.Scanner;

public class PointTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Point point = new Point();
        System.out.println("Podaj wspolrzedne punktu x i y");
        int x = keyboard.nextInt();
        keyboard.nextLine();
        int y = keyboard.nextInt();
        keyboard.close();
        System.out.println(point.quarter(x, y));
    }
}
