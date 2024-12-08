package work6;



public class ChinaPeople extends People{
    public  void  speakHello(){
        System.out.println("hello,I am ChinaPeople.");
    }
    public void chinaGongfu(){
        System.out.println("I can gongfu.");
    }
    public  void  averageHeight()  {
        System.out.println("avarge heigh of ChinaPeople:"  +  height);
}

public  void  averageWeight()  {
        System.out.println("average weight of ChinaPeople:"  +  weight);
}
public static void main(String[] args) {
    ChinaPeople  chp  =  new  ChinaPeople();
                chp.height  =  180;
                chp.weight  =  130;
                chp.speakHello();
                chp.averageHeight();
                chp.averageWeight();
                chp.chinaGongfu();
}
}
