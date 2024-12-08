package work6;

import work5.Human;

public class Man extends Human{
    public  void  speak()  {
        System.out.println("I am a man.");
}
public  void  run()  {
    System.out.println("I am a strong man.");
}




    public static void main(String[] args) {
        Man  m  =  new  Man();
                m.setName("Dave");
                m.setAge(28);
                m.setSex("man");
                m.getInfo();
                m.speak();
                m.run();        
    }
}
