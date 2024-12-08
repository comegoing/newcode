package experiment3;
import  java.util.Scanner;
public class Table {
    private String s;
    private int leg;
    private int hight;
    private int ar;
    public Table(String s,int leg,int hight,int ar){
        this.s = s;
        this.leg = leg;
        this.hight = hight;
        this.ar = ar;
    }
    @Override
    public String toString() {
        StringBuffer new_string = new StringBuffer();
        new_string.append("Shape:");
        new_string.append(s);
        new_string.append("\n");

        new_string.append("Legs:");
        new_string.append(leg);
        new_string.append("\n");

        new_string.append("Hight");
        new_string.append(hight);
        new_string.append("\n");

        new_string.append("Area:");
        new_string.append(ar);
        new_string.append("\n");
        // return new_string.toString();
        return ""+new_string;
    }
    public  static  void  main(String[]  args)  {
        Scanner  sc=new  Scanner(System.in);
        String  s=sc.nextLine();
        int  leg=sc.nextInt();
        int  hight=sc.nextInt();
        int  ar=sc.nextInt();
        Table  ta=new  Table(s,leg,hight,ar);
        System.out.println(ta);
        sc.close();
}
}