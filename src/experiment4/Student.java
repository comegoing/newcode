package experiment4;
import java.util.Scanner;
public class Student {
    private  String  name,  id;
    private  int  score;
    public Student(String name,String id,int score){
        this.name = name;
        this.id = id;
        if(score>=0&&score<=100)
            this.score = score;
        else
            this.score = 0;
    }
    
    @Override
    public String toString() {
        return "name="+name+",id="+id+",score="+score;
    }

    public void setScore(int score) {
        if(score>=0&&score<=100)
            this.score = score;
        else
            System.out.println("score input error");
    }
    public static void main(String[] args) {
        Scanner  in  =  new  Scanner(System.in);
        String  n,  s;
        int  sc;
        n  =  in.nextLine();
        s  =  in.nextLine();
        sc  =  in.nextInt();
        in.close();
        Student  stu  =  new  Student(n,  s,  sc);
        System.out.println(stu);
        stu.setScore(sc  +  50);
        System.out.println(stu);
    }
}
