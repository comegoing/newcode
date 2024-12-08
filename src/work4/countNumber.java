package work4;
// import java.util.HashMap;
import java.util.Scanner;
public class countNumber{
    public static void main(String[] args) {
        int [] number = {0,0,0,0};
        System.out.println("Please input a sentence:");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char [] c = str.toCharArray();
        for(char new_c : c){
            if(new_c-'0'>=0&&new_c-'0'<=9){
                number[0]++;
            }
            else if((new_c-'a'>=0&&new_c-'a'<=26)||(new_c-'A'>=0&&new_c-'A'<=26)){
                number[1]++;
            }
            else if(new_c-' '==0){
                number[2]++;
            }
            else{
                number[3]++;
            }
        }
        System.out.println("The number of numbers is: "+number[0]);
        System.out.println("The number of English letters is: "+number[1]);
        System.out.println("The number of blank space is: "+number[2]);
        System.out.print("The number of other characters is: "+number[3]);
        
        
        
        in.close();

    }
}