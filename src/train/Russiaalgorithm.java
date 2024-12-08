package train;
import java.util.Scanner;

public class Russiaalgorithm {
    private int sum = 0;
    private int number1 = 0;
    private int number2 = 0;
    public Russiaalgorithm(int number1,int number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    int count(){
        while(number1!=1){
            if(number1%2==0){
                number1 = number1/2;
                number2 = number2*2;
            }
            else{
                number1 = (number1-1)/2;
                sum = number2+sum;
                number2 = number2*2;
                
            }
        }
        sum = sum+number2;
        return sum;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Russiaalgorithm number = new Russiaalgorithm(in.nextInt(),in.nextInt());
        int result = number.count();
        System.out.println(result);
        in.close();
    }
    
}
