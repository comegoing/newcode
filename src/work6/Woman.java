package work6;

import work5.Human;

public class Woman extends Human{
    public  void  speak()  {
        System.out.println("I am a woman.");
}
public  void  run()  {
    System.out.println("I am a beautiful woman.");
}




    public static void main(String[] args) {
        Human  h  =  new  Woman();
                h.setName("Jude");
                h.setAge(58);
                h.setSex("woman");
                h.getInfo();
                h.speak();
                h.run();        
    }
}
