package work3;
import java.util.Scanner;
public class ABCDE {
    public static void main(String[] args) {
        System.out.println("Please input a score:");   
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        if(k>=90)
            System.out.println("A");
        else if(k>=80&&k<90)
            System.out.println("B");
        else if(k>=70&&k<80)
            System.out.println("C");
        else if(k>=60&&k<70)
            System.out.println("D");
        else
            System.out.println("E");
        in.close();
    }
}
