package work2;
import java.util.Scanner;
public class findMax {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
        System.out.println("Please input the first number:");
        int x = k.nextInt();
        System.out.println("Please input the second number:");
        int y = k.nextInt();
        System.out.println("Please input the third number:");
        int z = k.nextInt();
        int temp = x>y ? x : y;
        int max = z>temp ? z : temp;
        System.out.println("The maximum number is:"+max);
        k.close();
    }
}
