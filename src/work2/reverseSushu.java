package work2;
import java.util.Scanner;

public class reverseSushu {
    private int renumber = 0;
    private int number = 0;
    public reverseSushu(int number){
        this.number = number;
    }
    void reverse(){
        String k = ""+number;
        StringBuilder new_k = new StringBuilder(k).reverse();
        String kk = new_k.toString();
        // String kk = ""+new_k;
        
        renumber = Integer.parseInt(kk);
    }
    boolean judgenumber(int new_number){
        for(int i = 2;i<new_number-1;i++){
            if(new_number%i==0)
                return false;
        }
        return true;
    }
    boolean judge(){
        if(judgenumber(number)&&judgenumber(renumber))
            return true;
        return false;
    }
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        reverseSushu  n = new reverseSushu(m.nextInt());
        n.reverse();
        if(n.judge())
            System.out.println("yes");
        else
            System.out.println("no");
        m.close();
    }
}
