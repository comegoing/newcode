package work5;
import java.util.Scanner;
public class MyPoint {
    private float x ;
    private float y ;
    MyPoint(){
        this.x = 0;
        this.y = 0;
    }
    MyPoint(float x ,float y){
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println("Your location of horizontal (X) is :"+x);
        System.out.println("Your location of ordinate (Y) is :"+y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the horizontal (X) : ");
        float x = in.nextFloat();
        System.out.println("Please input the ordinate (Y) : ");
        float y = in.nextFloat();
        MyPoint my = new MyPoint(x, y);
        my.print();

        in.close();
    }
}
