package series;
import java.util.Scanner;
public class series2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=1, b=1;
		for(int i=1;i<=n;i++) {
			System.out.print(a+" ");
			int next=a+b;
			a=b;
			b=next;
		}
	}

}
