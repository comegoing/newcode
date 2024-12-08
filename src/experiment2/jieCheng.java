package experiment2;
import java.util.Scanner;
public class jieCheng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        int i = 1;
        int j =1;
        int temp = 1;
        do{
            do{
                temp = temp*j;
                j++;
            }while(j<i);
            sum = sum+temp;
            i++;
        }while(i<=n);
        System.out.println("1!~"+n+"!="+sum);
        in.close();
    }
}
