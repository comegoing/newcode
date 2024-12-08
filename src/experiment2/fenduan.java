package experiment2;
import java.util.Scanner;
public class fenduan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = 1;
        if(x>0){
            y = Math.pow(Math.E, -x);
        }
        else if(x<0){
            y = -Math.pow(Math.E, x);
        }
        System.out.printf("y=" + String.format("%.4f", y));
        in.close();
    }
}
