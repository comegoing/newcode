package work4;
import java.util.Scanner;
public class huiWenshu {
    private int number = 0;
    private String str; 
    public huiWenshu(){

    }
    public huiWenshu(int number){
        this.number = number;
    }
    void transform(){
        str = ""+number;
    }
    boolean huiwen(){
        StringBuilder new_str = new StringBuilder(str).reverse();
        if(str.equals(new_str.toString()))
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        // huiWenshu mynumber = new huiWenshu(m);
        // mynumber.transform();
        // if(!mynumber.huiwen())
            // System.out.println(m);
        for(int i = m;i<=n;i++){
            huiWenshu newnumber = new huiWenshu(i);
            newnumber.transform();
            if(newnumber.huiwen())
                System.out.println(i);
        }
        in.close();
    }
}
