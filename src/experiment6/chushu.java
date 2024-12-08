package experiment6;
import java.util.Scanner;
class NegativeException extends Exception{
    public NegativeException(){
    }
    public NegativeException(String s){
        super(s);
    }
}
class ZeroException extends Exception{
    public ZeroException(){
    }
    public ZeroException(String s){
        super(s);
    }
}
public class chushu {
    private float num1;
    private float num2;
    public chushu(float number1,float number2) throws NegativeException,ZeroException{
        if(number2==0){
            throw new ZeroException("The divisor, "+(int)number2+",could not be zero!");
        }
        else if(number2<0){
            throw new NegativeException("The divisor, "+(int)number2+", could not be negative!");
        }
        else{
            this.num1 = number1;
            this.num2 = number2;
        }
    }
    public float xiangchu(){
        return num1/num2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please input first number: ");
        float x = s.nextFloat();
        System.out.println("Please input second number: ");
        float y = s.nextFloat();
        try{
            chushu c = new chushu(x, y);
            System.out.println("Divisor is : "+c.xiangchu());
            
        }
        catch(ZeroException e){
            System.out.println(e.getMessage()); 
        }
        catch(NegativeException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.print("finally!");
        }
        s.close();
    }   
}
