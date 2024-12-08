package work9;

import java.util.ArrayList;
import java.util.Scanner;
class Book implements Comarable{
    public Book(String name,float price){
        this.name = name;
        this.price = price;
    }
    private String name;
    private float price;
    public void compareTo(float price){
        if(this.price == price){
            System.out.println(name+","+this.price);
        }
    }
}
interface Comarable{
    public void compareTo(float price);
}
public class chazhao {
    public static void main(String[] args) {
        ArrayList<Book> myset= new ArrayList<Book>();
        Scanner in = new Scanner(System.in);
        System.out.println("input several Book,in the end #");
        String new_str [];
        String name;
        int price;
        String str = in.nextLine();
        while(!str.equals("#")){
            new_str = str.split(",");
            name = new_str[0];
            price = Integer.parseInt(new_str[1]);
            Book k = new Book(name, price);
            myset.add(k);
            str = in.nextLine();
        }
        System.out.println("input a new Book:");
        str = in.nextLine();
        new_str = str.split(",");
        name = new_str[0];
        price = Integer.parseInt(new_str[1]);
        System.out.println("new book:<"+name+">as same books");

        for(int i=0;i<myset.size();i++){
            myset.get(i).compareTo(price);
        }
        in.close();
    }
}
