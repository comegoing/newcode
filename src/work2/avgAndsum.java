package work2;
import java.util.Scanner;
public class avgAndsum {
    private int number_a = 1;
    private int number_b = 2;
    private int number_c = 3;
    public avgAndsum(int number_a,int number_b,int number_c){
        this.number_a = number_a;
        this.number_b = number_b;
        this.number_c = number_c;
    }
    double avg(){
        return ((double)number_a+(double)number_b+(double)number_c)/3;
    }
    double cnt(){
        
        return ((double)number_a+(double)number_b+(double)number_c);
        
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        avgAndsum k = new avgAndsum(in.nextInt(), in.nextInt(), in.nextInt());
        double p = k.avg();
        double q = k.cnt();
        System.out.println("sum="+q);
        System.out.println("average="+p);
        in.close();
    }
}
