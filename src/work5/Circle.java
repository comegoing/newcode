package work5;
import java.util.Scanner;
public class Circle {
    private double radius = 0;
    private double area = 0;
    private double perimeter = 0;
    Circle(){
        radius = 0;
    }
    Circle(double radius){
        this.radius = radius;
    }
    double getPerimeter(){
        perimeter = radius*2*Math.PI;

        return perimeter;
    }
    double getArea(){
        area = radius*radius*Math.PI;
        return area;
    }
    void disp(){
        System.out.printf("radius=%.4f\n",radius);
        System.out.printf("perimeter=%.4f\n",getPerimeter());
        System.out.printf("area=%.4f\n",getArea());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble();
        in.close();

        Circle c = new Circle(r);
        c.disp();
    }
}
