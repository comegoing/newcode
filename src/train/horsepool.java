package train;
import java.util.HashMap;
import java.util.Scanner;
// import java.util.Set;
// import java.util.Map.Entry;

public class horsepool {
    private HashMap<Character,Integer> mymap = new HashMap<Character,Integer>();
    private char new_txt [];
    private char new_model [];
    private int m = 0;
    private int size = 0;
    public horsepool(){
        System.out.println("there is no input");
    }
    public horsepool(String txt,String model){
        new_txt = txt.toCharArray();
        new_model = model.toCharArray();
        m = model.length();
        size = txt.length();
        for(char mychar:new_model){
            mymap.put(mychar, m);
        }
    }
    void shifttable(){
        for(int i = 0;i<m-1;i++){
            for(char mychar:mymap.keySet()){
                if(new_model[i]==mychar){
                    mymap.replace(mychar, m-i-1);
                }
                
            }
        }
        // Set<Entry<Character,Integer>> set=mymap.entrySet();
		// for(Entry<Character,Integer> entry:set) {
		// 	System.out.print(entry.getKey()+"-");
		// 	System.out.println(entry.getValue());
		// }
    }


    int match(){
        shifttable();
        int i = m-1;
        while(i<size){
            int j = 0;
            while(j<m&&(new_model[m-1-j]==new_txt[i-j])){
                j++;
            }
            if(j==m){
                return 1;
            }
            else{
                if(mymap.get(new_txt[i])==null){
                    i+=m;
                }
                else
                    i+=mymap.get(new_txt[i]);
            }
        }
        return -1;
    }
    void ismatch(){
        int flag = match();
        if(flag==1){
            System.out.println("yes");
        }
        else if(flag==-1)
            System.out.println("no");

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String txt = in.nextLine();
        String model = in.nextLine();
        in.close();
        horsepool pipei = new horsepool(txt, model);
        pipei.ismatch();
    }
}
