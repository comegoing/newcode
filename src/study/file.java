package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
// import java.io.Reader;
public class file {
    public static void main(String[] args) {
        File f = new File("D:\\Users\\ASUS\\Desktop", "java.txt");
        int n = -1;
        byte [] b = new byte [100]; 
        if(!f.exists()){
            try{
                f.createNewFile();
                System.out.println("the operation is done");
            }
            catch(Exception e){
                System.out.println("the operation is failed");
            }
        }
        try(FileInputStream in = new FileInputStream(f)){
            while((n=in.read(b,0,100))!=-1){
                String s = new String(b,0,n);
                System.out.print(s);
            }
            
        }
        catch(IOException e){
            System.out.println("error");
        }
        
    }
}
