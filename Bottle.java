package Training;
import java.util.*;
public class Bottle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SaleUtility sale=new SaleUtility();
		List<BottleSale> tempSale=new ArrayList<>();
		System.out.println("enter the number of sales records:");
		int n=sc.nextInt();
		sc.nextLine();
		if(n<=0) {
			System.out.println("Invalid");
			return;
		}
		System.out.println("enter sales details");
		for(int i=0;i<n;i++) {
		String str=sc.nextLine();
		String[] parts=str.split("/");
		
		String size=parts[0];
		int qnt=Integer.parseInt(parts[1]);
		double total=Double.parseDouble(parts[2]);
		
		if(qnt<=0) {
			System.out.println("Quantity should be a valid number");
			return;
		}
		tempSale.add(new BottleSale(size,qnt,total));
		}
		sale.setBottleList(tempSale);
		BottleSale maxTrip=sale.findMax(sale.convertToStream());
		if(maxTrip!=null) {
			System.out.println(maxTrip.getSizeLabel() + " had the highest quantity with " + 
                    maxTrip.getQuantitySold() + " bottles");		}
	}

}
