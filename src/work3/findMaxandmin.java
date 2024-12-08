package work3;
import java.util.Scanner;
import java.util.Arrays;
// import java.lang.String.split;
public class findMaxandmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numlength = in.nextInt();
        in.nextLine();
        String string = in.nextLine();
        String [] newstring = string.split(" ");
        int [] aaa = new int[numlength];
         for(int i=0;i<newstring.length;i++){
             aaa[i] = Integer.parseInt(newstring[i].toString());
         }
        int Max = Arrays.stream(aaa).max().getAsInt();
        int Min = Arrays.stream(aaa).min().getAsInt();
        System.out.printf("%d %d",Max,Min);
        in.close();
        

    }
}
