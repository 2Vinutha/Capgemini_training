package series;
import java.util.Scanner;
public class series3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int curVal1=1;
		int curVal2=-2;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(curVal1+" ");
				curVal1=curVal1+3;
			}else {
				
				System.out.print(curVal2+" ");
				curVal2=curVal2-4;
			}
		}

	}

}
