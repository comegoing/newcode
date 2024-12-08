package work2;
import java.util.Scanner;
public class wanShu {
    private int count = 0;   // to count all factors together
    private int number = 0;     // to get the number we input
    public wanShu(int number){  // a class to get a number 
        this.number = number;
    }
    boolean judgenumber(){
        for(int i = 1;i<number;i++){
            if(number%i == 0)
                count += i; 
        }
        if(count == number) 
        {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        int m = a.nextInt();
        int n = a.nextInt();
        System.out.println(m+" to "+n+" WanShu:");
        for(int j = m;j<=n;j++)
        {
            wanShu s =new wanShu(j);// create a class to caculate
            if(s.judgenumber())  //ture output
                System.out.print(j+",");
        }
        a.close();
    }
}
