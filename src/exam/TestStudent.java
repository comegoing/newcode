package exam;
class  Student  {
    protected  double  height;
    protected  double  weight;

    public  double  getHeight()  {
            return  height;
    }

    public  void  setHeight(double  height)  {
            this.height  =  height;
    }

    public  double  getWeight()  {
            return  weight;
    }

    public  void  setWeight(double  weight)  {
            this.weight  =  weight;
    }

    public  void  speakHello()  {
            System.out.println("hello!");
    }

    public  void  averageHeight()  {
            System.out.println("avarge  heigh:"  +  height);
    }

    public  void  averageWeight()  {
            System.out.println("average  weight:"  +  weight);
    }
}

class  LiberalArtsStudent  extends  Student  {
    public void speakHello() {
        System.out.println("hello,I am liberal arts student!");
}
    public  void  averageHeight()  {
        System.out.println("avarge heigh of LiberalArtsStudent:"  +  height);
}
    public  void  averageWeight()  {
        System.out.println("average weight of LiberalArtsStudent:"  +  weight);
}
    public void liberalArtsFeature(){
        System.out.println("I read history.");
    }
}
class  ScienceStudent  extends  Student  {
    public void speakHello() {
        System.out.println("hello,I am science student.");
}
    public  void  averageHeight()  {
        System.out.println("avarge heigh of ScienceStudent:"  +  height);
}
    public  void  averageWeight()  {
        System.out.println("average weight of ScienceStudent:"  +  weight);
}
    public void scienceFeature(){
        System.out.println("I do experiment.");
    }
}
public class TestStudent {
    public  static  void  main(String[]  args)  {
        ScienceStudent  chp  =  new  ScienceStudent();
        chp.height  =  180;
        chp.weight  =  130;
        chp.speakHello();
        chp.averageHeight();
        chp.averageWeight();
        chp.scienceFeature();
        LiberalArtsStudent  amp  =  new  LiberalArtsStudent();
        amp.setHeight(175);
        amp.setWeight(150);
        amp.speakHello();
        amp.averageHeight();
        amp.averageWeight();
        amp.liberalArtsFeature();
}
}
