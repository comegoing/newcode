package work4;
import java.util.Scanner;
public class changePosition {
    public static void main(String[] args) {
        int [] a = new int[10];
        Scanner in = new Scanner(System.in);

        System.out.println("Please input 10 numbers:");

        for(int i = 0;i<10;i++){
            a[i] = in.nextInt();
        }

        System.out.println("Your numbers are:");

        for(int i =0;i<10;i++){
            if(i==9){
                System.out.printf("%d",a[i]);
                System.out.println();
            }
            else
                System.out.printf("%d ",a[i]);
        }

        System.out.println("Please input m:");

        int m = in.nextInt();
        in.close();

        int []b= new int[m];
        int j = 0;

        for(int i = 10-m;i<10;i++){
            b[j] = a[i];
            j++;
        }

        for(int i = 9-m;i>=0;i--)
        {
            a[i+m] = a[i];
        }

        for(j=0;j<m;j++){
            a[j] = b[j]; 
        }

        System.out.println("The new numbers are:");
        for(int i =0;i<10;i++){
            if(i==9){
                System.out.printf("%d",a[i]);
                System.out.println();
            }
            else
                System.out.printf("%d ",a[i]); 
            }
    }
}
