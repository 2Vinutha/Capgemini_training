package series;
import java.util.Scanner;
public class series1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter: ");
        int n = sc.nextInt();

        int value = 1;
        for (int i = 1; i <= n; i++) {
        	
        	if(i%2==0) {
        		System.out.print("-"+value+" ");
        	}else {
        		System.out.print(value+" ");
        	}
        	value=value+(i*i);
        }
	}
}