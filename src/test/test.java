package test;

import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        int i = 0;
        Scanner input = new Scanner(System.in);
        i = input.nextInt();
        input.close();
        switch (i) {
            case 1:
                System.out.println("ok");
                // break;
            case 2:
                System.out.println("no");
                // break;
        
            default:
                System.out.println("over");
                // break;
        }

        
        
        


    }
}