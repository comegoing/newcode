package experiment6;
import java.util.ArrayList;
import java.util.Scanner;
public class xuesheng {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many students?");
        int sum = Integer.parseInt(input.nextLine());
        if(sum!=0){
            System.out.println("Please input the names of students:");
            for(int i =0;i<sum;i++){
                str.add(input.nextLine());
            }
            System.out.println("All the students bellow:");
            for(int i =0;i<str.size();i++){
                System.out.println((i+1)+":"+str.get(i));
            }
        }
        else
            System.out.println("All the students bellow:");
        input.close();
    }
}
