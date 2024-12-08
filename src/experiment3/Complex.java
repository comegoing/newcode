package experiment3;
import java.util.Scanner;
public class Complex {
    private float ai;
    private float aj;
    private float bi;
    private float bj;
    private float ci = 0;
    private float cj = 0;
    public Complex(){
        this.ai = 0;
        this.aj = 0;
        this.bi = 0;
        this.bj = 0;
    }
    public Complex(float ai,float aj,float bi,float bj){
        this.ai = ai;
        this.aj = aj;
        this.bi = bi;
        this.bj = bj;
    }
    void multiply(){
        ci = ai*bi - aj*bj;
        cj = ai*bj + aj*bi;
        System.out.println("(a * b) = "+ci+" + "+cj+"i");
    }
    void add(){
        ci = ai + bi;
        cj = aj + bj;
        System.out.println("(a + b) = "+ci+" + "+cj+"i");
    }
    void drease(){
        ci = ai - bi;
        cj = aj - bj;
        System.out.println("(a - b) = "+ci+" + "+cj+"i");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input c1:");
        float x1 = in.nextFloat();
        float y1 = in.nextFloat();

        System.out.println("input c2:");
        float x2 = in.nextFloat();
        float y2 = in.nextFloat();
        in.close();

        Complex com = new Complex(x1,y1,x2,y2);
        System.out.println("ComplexNumber a: "+x1+" + "+y1+"i");
        System.out.println("ComplexNumber b: "+x2+" + "+y2+"i");

        com.add();
        com.drease();
        com.multiply();
    }
}
