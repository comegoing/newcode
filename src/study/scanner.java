package study;
import java.util.InputMismatchException;
import java.util.Scanner;

// import javax.print.DocFlavor.STRING;
public class scanner {
    public static void main(String[] args) {
        String str = "hello, my name is lvxin, last Monday, I cost 120 yuan and I cost 200 yuan last Friday";
        Scanner new_str = new Scanner(str);
        double sum = 0;
        while(new_str.hasNext()){
            try{
                double price = new_str.nextDouble();
                sum = sum+ price;
            }
            catch(InputMismatchException exp){
                String k = new_str.next();
                System.out.println(k);

            }
        }
        new_str.close();
        System.out.println("the sum of cost:"+sum);

    }
}
