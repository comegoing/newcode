package work8;

import java.util.Scanner;
import java.lang.Math;

public class transformnumber {
    private int zheng;
    private int zi;
    private int mu;
    private int len;
    public transformnumber(String number){
        String str []= number.split("\\.");// when regex is .  ,it must be \\.
        
        zheng = Integer.parseInt(str[0]);
        
        zi = Integer.parseInt(str[1]);
        
        len = str[1].length();
        
        mu = (int)Math.pow(10, len);
    }
    public transformnumber(){}
    int gcd(){
        int a = zi;
        int b = mu;
        while(true){
            if(a>b){
                a-=b;
            }
            else if(a<b){
                b-=a;
            }
            else{
                return a;
            }
        }
    }
    void yuefen(){
        int temp = gcd();
        zi = zi/temp;
        mu = mu/temp;
    }
    @Override
    public String toString() {
        return zheng+" "+zi+" "+mu;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        in.close();
        transformnumber number = new transformnumber(a);
        number.yuefen();
        System.out.println(number);

    }
}
