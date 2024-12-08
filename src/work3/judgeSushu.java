package work3;
import java.util.Scanner;

public class judgeSushu {
    private int number = 0;
    public judgeSushu(int number){
        this.number = number;
    }
    int judge(){
        if(number > 2){
        for(int i = 2;i<number;i++){
            if(number%i==0)
                return 0;
        }
        return 1;
    }
        else if(number == 0){
            return -1;
        }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 1;
        do {
            
            number = in.nextInt();
            judgeSushu k = new judgeSushu(number);
            if (k.judge() == 1){
                System.out.printf("%d is sushu.\n",number);
            }
            else if (k.judge() == 0){
                System.out.printf("%d is not sushu.\n",number);
            }
            else if (k.judge() == -1){
                System.out.printf("programe is over.");
            }
            
        }while(number!=0);
        in.close();
    }
}
