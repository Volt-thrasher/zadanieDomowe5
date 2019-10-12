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
        System.out.println("Podaj X");
        setX(x = keyboard.nextInt());
        System.out.println("Podaj Y");
        setY(y=keyboard.nextInt());
        if (getX()>0&&getY()>0){
            num = "I";
        } else if (getX()>0&&getY()<0){
            num="II";
        }else if (getX()<0&&getY()<0){
            num = "III";
        }else if (getX()<0&&getY()>0){
            num="IV";
        }else {
            System.out.println("Punkt (0,0) znajduje sie w poczatku ukladu wspolrzednych");
        }
        if (num!=null){
            System.out.println("Punkt("+getX()+"; "+getY()+") lezy w "+num+" cwiartce ukladu wspolrzednych");
        }
    }
}
