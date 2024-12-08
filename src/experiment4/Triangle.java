package experiment4;
import java.util.Scanner;
public class Triangle {
    private  double  a,  b,  c;
    private boolean isornot(double a,double b,double c){
        boolean is = true;
        if(((a+b)>c)&&((b+c)>a)&&((a+c)>b))
            is = true;
        else
            is = false;
        return is;
    } 
    public Triangle(double a,double b,double c){
        if(isornot(a, b, c)==true){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else{
            System.out.println("a b c input error");
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getPerimeter(){
        return a+b+c;
    }
    public double getArea(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    public void setA(double a){
        if(isornot(a, b, c)==false)
            System.out.println("a input error");
        else
            this.a = a;
    }
    public void setB(double b){
        if(isornot(a, b, c)==false)
            System.out.println("b input error");
        else
            this.b = b;
    }
    public void setC(double c){
        if(isornot(a, b, c)==false)
            System.out.println("c input error");
        else
            this.c = c;
    }
    public void setSide(double a,double b,double c){
        if(isornot(a, b, c)==true){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    
    @Override
    public String toString() {

        return "a=" + a + ",b=" + b + ",c=" + c;
    }
    public static void main(String[] args) {
        Scanner  in  =  new  Scanner(System.in);
        double  x  =  in.nextDouble();
        double  y  =  in.nextDouble();
        double  z  =  in.nextDouble();
        Triangle  t  =  new  Triangle(x,  y,  z);
        System.out.println("perimeter="  +  t.getPerimeter());
        System.out.println("area="  +  t.getArea());
        System.out.println(t);
        t.setSide(t.getA()  +  3,  t.getB()  +  2,  t.getC()  +  1);
        System.out.println(t);
        t.setA(t.getA()  +  20);
        System.out.println(t);
        t.setB(t.getB()  +  20);
        System.out.println(t);
        t.setC(t.getC()  +  20);
        System.out.println(t);
        in.close();
    }
}
