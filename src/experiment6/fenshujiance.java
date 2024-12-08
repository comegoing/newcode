package experiment6;
import java.util.Scanner;
class MyException extends Exception{
    public MyException(){

    }
    public MyException(String s){
        super(s);
    }
}
public class fenshujiance {
    private int score;
    public fenshujiance(int score) throws MyException {
        if(score>=0&&score<=100){
            this.score = score;
        }
        else{
            throw new MyException("Error,score should be in 0-100.");
        }
    }
    public void show(){
        System.out.println("Your score is:"+score);
    }
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Please input your score");
        try{
            fenshujiance f = new fenshujiance(sca.nextInt());
            f.show();
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        sca.close();
    }
}
