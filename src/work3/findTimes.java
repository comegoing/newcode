package work3;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
public class findTimes {
    public static void main(String[] args) {
        HashMap<String,Integer> mymap = new HashMap<String,Integer>();
        // first give a key to compare or it will be false
        mymap.put("sss", 0);
        Scanner in = new Scanner(System.in);
        //all input is string
        String []string = in.nextLine().split("");
        // give a flag (the value will ++ or just be 1)
        int flag = 1;
        for(String newstring: string){
            // if the string is "," or " ",continue the circle ,else to count the number of character
            if(newstring.toLowerCase().equals(newstring.toUpperCase()))
                continue;
            else
            {
                newstring = newstring.toUpperCase();
                for(String newkey: mymap.keySet()){
                    //if repeted , temp++
                    if(newkey.equals(newstring)){
                        int temp = mymap.get(newkey);
                        temp++;
                        mymap.put(newstring, temp);
                        // let flag = 0 to jump the next given
                        flag = 0;
                    }
                }
                if(flag == 1 ){
                    // if flag = 1, there is no repeted ,then give 1
                    mymap.put(newstring, 1);
                }
                //everytime the circle is done,let flag =1
                flag = 1;
            }
        }
        mymap.remove("sss");
        //hashmap can't sort ,array can
        Object [] newmap = mymap.keySet().toArray();
        Arrays.sort(newmap);
        for(int i = 0 ;i<newmap.length;i++){
            System.out.println("("+newmap[i]+")"+"Num="+mymap.get(newmap[i]));
        }
        in.close();
    }
}
