package study;

import java.io.File;

public class exe {
    public static void main(String[] args) {
        try{
            Runtime e = Runtime.getRuntime();
            File file = new File("D:\\QQMusic", "QQMusic.exe");
            e.exec(file.getAbsolutePath());
        }
        catch(Exception exp){
            System.out.println(exp);
        }
    }
    
}
