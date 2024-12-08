package study;

import java.io.BufferedReader;
// import java.io.BufferedWriter;
import java.io.File;
// import java.io.FileInputStream;
import java.io.FileReader;
// import java.io.FileWriter;
import java.io.IOException;
// import java.io.InputStream;
// import java.io.InputStreamReader;

public class huanchong {
    public static void main(String[] args) {
        File f = new File("D:\\Users\\ASUS\\Desktop", "write.txt");
        try{
            // FileWriter file1 = new FileWriter(f);
            // BufferedWriter in = new BufferedWriter(file1);
            // for(int i=0;i<3;i++){
            //     in.write("我是你爹");
            //     in.newLine();
            // }

            FileReader file2 = new FileReader(f);
            // InputStreamReader is = new InputStreamReader(new FileInputStream(f),"ANSI"); 
            BufferedReader out =  new BufferedReader(file2);
            String str = null;
            while((str=out.readLine())!=null){
                byte b[] = str.getBytes("UTF-8");
                String content = new String(b,"UTF-8");

                System.out.println(content);
        }
        // in.close();
        out.close();
        // file1.close();
        // file2.close();



        }
        catch(IOException e){
            System.out.println("read error");
        }
    }
}
