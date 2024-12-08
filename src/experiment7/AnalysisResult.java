package experiment7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
class Fenxi{
    private int sum = 0;
    private File f1;
    private File f2;
    public Fenxi(File f1,File f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    public void tongji(){
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter(f2));
            BufferedReader r = new BufferedReader(new FileReader(f1));
            String listener;
            while((listener=r.readLine())!=null){
                String listener_new = listener.replaceAll(",", " ");
                Scanner input = new Scanner(listener_new);
                while(input.hasNext()){
                try{
                    sum = sum + input.nextInt();
                }
                catch(InputMismatchException e){
                    input.next();
                }
            }
            input.close();
            w.write(listener+" zongFen:"+(float)sum);
            w.newLine();
                sum = 0;
            }
            w.close();
            r.close();
        }
        catch(IOException e){       
        }
    }
}
public class AnalysisResult {
    public static void main(String[] args) {
        try{
            File f1 = new File("D:\\Users\\ASUS\\Desktop", "score.txt");
            File f2 = new File("D:\\Users\\ASUS\\Desktop", "scoreAnalysis.txt");
            Fenxi x = new Fenxi(f1, f2);
            x.tongji();
        }
        catch(Exception e){
        }
    }
}
