package Training;
import java.util.*;
public class UserInterfaceCar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car obj=new Car();
		int opt;
		while(true) {
			System.out.println("1.Add car\n2.Search by name,\n3.Search by count,\n4.total,\n5.exit");
			System.out.println("enter your option");
		opt=sc.nextInt();
		sc.nextLine();
		if(opt==1) {
			System.out.println("enter car name:");
			String name=sc.nextLine();
			System.out.println("enter no of cars sold:");
			int num=sc.nextInt();
			if(num>0) {
				obj.addCar(name, num);
			}
		}
		else if(opt==2){
				if(obj.getCarMap().isEmpty()) {
				System.out.print("the map is empty");
				}else {
					System.out.println("enter name:");
					String searchCar=sc.nextLine();
					int count=obj.carByName(searchCar);
					if(count==-1) {
						System.out.println("car not found");
					}else {
						System.out.println(count);
					}
				}
		}else if(opt==3) {
			if(obj.getCarMap().isEmpty()) {
				System.out.print("the map is empty");
				}else {
					System.out.println("enter count:");
					int searchCount=sc.nextInt();
					List<String> found=obj.carByCount(searchCount);
					if(found==null) {
					System.out.println("no car");
					}else {
						for(String name:found){
							System.out.println(name);
						}
						
					}
				}
		}else if(opt==4) {
				if(obj.getCarMap().isEmpty()) {
					System.out.print("the map is empty");
				}else {
					obj.carSold();
					System.out.println(obj.carSold());
				}
		}else if(opt==5) {
			System.out.println("thankyou for using the application");
			break;
			}
		}
	}
}