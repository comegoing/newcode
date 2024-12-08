package work7;
import java.util.Scanner;
public class P4T1 {
    public  static  void  main(String[]  args)  {
                
        Father  f  =  new  Father();
        Mother  m  =  new  Mother();
        
        // String  name;
        // int  age;
        
        Scanner  s  =  new  Scanner(System.in);
        
        System.out.println("Please  input  your  father's  name:");
        f.setName(s.nextLine());
        System.out.println("Please  input  your  mother's  name:");
        m.setName(s.nextLine());
        
        System.out.println("Please  input  your  father's  age:");
        f.setAge(s.nextInt());
        System.out.println("Please  input  your  mother's  age:");
        m.setAge(s.nextInt());
        
        f.setSex("M");
        f.message();
        f.getInfo();

        
        m.setSex("F");
        m.message();
        m.getInfo();
        s.close();
}
}
