package study;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class write {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        String str = k.nextLine(); 
        k.close();
        byte [] a = str.getBytes();
        
        File f = new File("D:\\Users\\ASUS\\Desktop", "write.txt");

        if(!f.exists()){
            try{
                f.createNewFile();
                System.out.println("the operation is done");
            }
            catch(IOException e){
                System.out.println("the operation is failed");
            }
        }
        try(FileOutputStream in = new FileOutputStream(f)){
            in.write(a);
            in.close();
        }
        catch (IOException e) {
            System.out.println("you can't write");
        }
    }
}
