package exam;
import java.util.Scanner;
public class fenjieyinzi {
    private int temp;
    private int number;
    public fenjieyinzi(int number){
        this.number = number;
    }
    public void fenjie(){
        temp = 2;
        System.out.print(""+number+"=");
        while(temp!=number){
            if(number%temp==0){
                
                number = number/temp;
                System.out.print(""+temp+"*");
                temp = 2;
            }
            else
                temp++;
        }
        System.out.print(""+number);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input number:");
        int num = in.nextInt();
        fenjieyinzi out = new fenjieyinzi(num);
        out.fenjie();
        in.close();
    }
}
