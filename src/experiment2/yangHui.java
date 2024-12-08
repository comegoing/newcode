package experiment2;
import java.util.Scanner;
public class yangHui {
    public static void main(String[] args) {
        //初始化阶段
        Scanner in = new Scanner(System.in);
        int n = in.nextInt()+1;
        in.close();
        char cor = ' ';
        int sum = (n-1)*2;
        int [][] yanghui = new int [n][n];
        //赋值阶段
        for(int i = 0;i<n;i++){
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
        }
        for(int i = 1;i<n-1;i++){
            for(int j = 0;j<i;j++){
                yanghui[i+1][j+1] = yanghui[i][j]+yanghui[i][j+1];
            }
        }
        //打印阶段
        for(int i = 0;i<n;i++){
            
            for(int x=0;x<sum-i*2;x++)
            {
                System.out.print(cor);
            }
            for(int j = 0 ;j<=i;j++){
                System.out.printf("%4d",yanghui[i][j]);
            }
            if(i!=n-1)
                System.out.println();
        }
    }
}
