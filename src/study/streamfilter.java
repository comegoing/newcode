package study;


import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;

import java.io.InputStreamReader;

public class streamfilter {
    public static void main(String[] args) {
        File f = new File("D:\\JAVA\\java\\newcode\\src\\study", "CD.java");
        try(BufferedReader out = new BufferedReader(new InputStreamReader(new FileInputStream(f)));) {
            String line = null;
            while((line=out.readLine())!=null){
                System.out.println(line);
            }
        } 
        catch (Exception e) {
            
        }
        
       
    }
}
