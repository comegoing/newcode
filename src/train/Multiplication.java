package train;
import java.util.Scanner;

public class Multiplication {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int multiplier1 = in.nextInt();//较大乘数
	int multiplier2 = in.nextInt();//较小乘数
	in.close();
	//把输入的乘数转化为字符串
	String m1 = multiplier1 + "";
	String m2 = multiplier2 + "";
	//把输入的乘数转化为字符数组
	char[] mul1 = m1.toCharArray();
	char[] mul2 = m2.toCharArray();
	//把输入的乘数转化为整形数组
	int[] x1 = new int[mul1.length];
	int[] x2 = new int[mul2.length];
	for(int i=0;i<x1.length;i++) {
		x1[i] = mul1[i] - '0';
	}
	for(int i=0;i<x2.length;i++) {
		x2[i] = mul2[i] - '0';
	}
	//将数组倒序
	reverseArray(x1);
	reverseArray(x2);
	int carry1 = 0;//乘数相乘的进位
	int carry2 = 0;//得数相加的进位
	int[] head = new int[x1.length+x2.length-1];
	for(int i=0;i<x2.length;i++) {
		int[] temp = new int[x1.length+x2.length-1];//temp数组用来保存乘数相乘后的结果
		for(int j=0;j<x1.length;j++) {
			temp[j] = (x1[j]*x2[i]+carry1)%10;//保存每个相乘的得数
			carry1 = (x1[j]*x2[i]+carry1)/10;//保存进位
			if((j == x1.length-1) &&(i != 0))  {
				move(temp, i);//先对得数数组进行移动
				for(int k=0;k<head.length;k++) {
					int headtemp = head[k];//保存head数组当前位，防止在下一步被覆盖
					head[k] = (head[k]+temp[k]+carry2)%10;//保存每个相加的得数
					carry2 = (headtemp+temp[k]+carry2)/10;//保存进位
				}
				//初始化进位
				carry1 = 0;
				carry2 = 0;
			}
			else if((j==x1.length-1) && (i==0)) {//第一次相加时，直接将得数数组复制到head数组就行，无需进行相加操作
				for(int k=0;k<head.length;k++) {
					head[k] = temp[k];
				}
			}
		}
	}
	//倒序输出结果
	for(int i=head.length-1;i>=0;i--) {
		System.out.print(head[i]);
	}
}
//将数组倒序的方法
public static void reverseArray(int Array[]) {
	int last = Array.length-1;
	for(int first=0;first<last;first++) {
		int temp = Array[first];
		Array[first] = Array[last];
		Array[last] = temp;
		last--;
	}
}
//将数组移动的方法
public static void move(int Array[],int n) {
	int[] temp = new int[n];//temp数组保存每次移动后被覆盖的数
	for(int i=0;i<n;i++) {
		temp[i] = Array[Array.length-(i+1)];
	}
	int j=Array.length-n-1;
	//将数组进行移动
	for(int i=Array.length-1;i>(n-1);i--) {
		Array[i] = Array[j];
		j--;
	}
	//将被覆盖的数放在数组空出来的位置
	for(int i=0;i<n;i++) {
		Array[i] = temp[n-(i+1)];
	}
}
}


