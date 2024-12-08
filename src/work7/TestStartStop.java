package work7;

public class TestStartStop {
    public  static  void  main(String[]  args)  {
        StartStop[]  ss  =  {  new  Elevator(),  new  Conference()  };
        for  (int  i  =  0;  i  <  ss.length;  i++)  {
                ss[i].start();
                ss[i].stop();
        }
        System.out.println("programe  over");
}
}
