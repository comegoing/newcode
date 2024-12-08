package study;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class bytearraystream {
    public static void main(String[] args) {
        try{
            ByteArrayOutputStream outbyte = new ByteArrayOutputStream();
            byte [] bytecontent = "hello world!".getBytes();
            outbyte.write(bytecontent);
            ByteArrayInputStream inbyte = new ByteArrayInputStream(outbyte.toByteArray());
            byte backbyte [] = new byte[outbyte.toByteArray().length];
            inbyte.read(backbyte);
            System.out.println(new String(backbyte));
        }
        catch(IOException e){
            
        }
    }
}
