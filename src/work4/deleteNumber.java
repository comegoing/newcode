package work4;
//rule:when you find the first example that number[i]>number[i+1],delete number[i]

import java.util.Scanner;
public class deleteNumber {
    private int [] number = new int [240];

    //the position of the number that will be deleted
    private int position = 0;
    
    //the times of delete operation
    private int sum = 0;

    //the final array length
    private int new_length = 0;

    //the valuable length of the array
    private int val_length = 0;

    //operation function :transform string to int array
    deleteNumber(String str,int sum){
        char [] new_str = str.toCharArray();
        for(int i = 0;i<str.length();i++){
            this.number[i] = new_str[i]-'0'; 
        }
        val_length = str.length();
        new_length = str.length()-sum;
        this.sum = sum;
    }

    //find the position of number that will be deleted
    int findPosition(){
        //follow the rule 
        for(int i = 0;i<val_length;i++){
            if(number[i]>number[i+1]){
                position = i;
                break; 
            }
        }
        return position;
    }
    //a delete operation from algorithm,but when a delete is done,the position of 0 should decrease,too
    void delete(){
        for(int i = 0;i<sum;i++){
            position = findPosition();
            for(int j =position;j<val_length-1;j++){
                number[j] = number[j+1];
            }
            val_length--;
        }
    }
    void print(){
        for(int i = 0;i<new_length;i++)
        {
            System.out.print(number[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        deleteNumber new_number = new deleteNumber(str, in.nextInt());
        new_number.delete();
        new_number.print();
        
        in.close();
    }
}
