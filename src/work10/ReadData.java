package work10;

public class ReadData {

    public static void main(String[] args) throws Exception{
        // 创建一个文件对象 
        java.io.File file = new java.io.File("D:\\JAVA\\java\\newcode\\src\\work10\\scores.txt"); 
        // 为文件创建一个Scanner对象
        java.util.Scanner input = new java.util.Scanner(file);
        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName+" "+mi+" "+lastName+" "+score);
        }
        input.close();
    }
}
