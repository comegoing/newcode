package experiment3;
import java.util.Scanner;
public class Triangle {
    private double a,b,c;
    private double perimiter = 0;
    private double area = 0;
    private double p = 0;
    public Triangle(double a, double b, double c){
        if(a+b<=c||a+c<=b||b+c<=a){
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
        else{
            this.a = a;
            this.b = b;
            this.c = c;
        }
        p = (this.a+this.b+this.c)/2;
    }
    void getPerimeter(){
        perimiter = a+b+c;
    }
    void getArea(){
        area = Math.pow(p*(p-a)*(p-b)*(p-c), 0.5);
    } 
    void print(){
        System.out.printf("perimeter=%.1f\n",perimiter);
        System.out.printf("area=%.1f\n",area);
        System.out.printf("a=%.1f,b=%.1f,c=%.1f\n",a,b,c);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble(); 
        Triangle new_num = new Triangle(x, y, z);
        new_num.getPerimeter();
        new_num.getArea();
        new_num.print();
        in.close();
    }
}
