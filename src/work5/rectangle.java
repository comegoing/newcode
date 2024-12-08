package work5;
import java.util.Scanner;
public class rectangle {
    private float a = 0;
    private float b = 0;
    private float area = 0;
    rectangle(float a,float b){
        this.a = a;
        this.b = b;
    }
    float countarea(){
        area = a*b;
        return area;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float length = 0;
        float width = 0;
        System.out.println("Please input length:");
        length = in.nextFloat();
        System.out.println("Please input width:");
        width  = in.nextFloat();
        in.close();
        rectangle re = new rectangle(length, width);

        System.out.println("The lengh is:"+length);
        System.out.println("The width is:"+width);
        System.out.println("The area is:"+re.countarea());
        
    }
}
