package zadanie2;
import java.util.Scanner;
public class Point {
    private int x;
    private int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    Point(){
    };

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    Scanner keyboard = new Scanner(System.in);
    public void quarter(){
        String num = null;
        x = keyboard.nextInt();
        y=keyboard.nextInt();
        if (x>0&&y>0){
            num = "I";
        } else if (x>0&&y<0){
            num="II";
        }else if (x<0&&y<0){
            num = "III";
        }else if (x<0&&y>0){
            num="IV";
        }else {
            System.out.println("Punkt (0,0) znajduje sie w poczatku ukladu wspolrzednych");
        }
        if (num!=null){
            System.out.println("Punkt("+x+"; "+y+") lezy w "+num+" cwiartce ukladu wspolrzednych");
        }
    }
}
