package study;

public class Item {
    private String name;
    private int playtime = 0;
    public Item(String name,int playtime){
        super();
        this.name = name;
        this.playtime = playtime;
    }
    void print(){
        System.out.println(name+playtime);
    }
    
   
    @Override
    public boolean equals(Object obj) {
        boolean flag = false;
        Item item = (Item)obj;
        if(name.equals(item.name)&&playtime==item.playtime)
            flag = true;
        return flag;
    }
    public static void main(String[] args) {
        
    }
}
