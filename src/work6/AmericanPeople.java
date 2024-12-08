package work6;

public class AmericanPeople extends People {
    public  void  speakHello(){
        System.out.println("hello,I am American!");
    }
    public void amercianBoxing(){
        System.out.println("I can boxing.");
    }
    public  void  averageHeight()  {
        System.out.println("avarge heigh of American:"  +  height);
}

public  void  averageWeight()  {
        System.out.println("average weight of American:"  +  weight);
}

public static void main(String[] args) {
    AmericanPeople  amp  =  new  AmericanPeople();
                amp.setHeight(175);
                amp.setWeight(150);
                amp.speakHello();
                amp.averageHeight();
                amp.averageWeight();
                amp.amercianBoxing();
                
}
}
