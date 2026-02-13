package Training;
import java.util.*;

public class SwiftCabs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TripUtility trip=new TripUtility();
		List<TripStat> templist=new ArrayList<>();
		System.out.println("enter the number of records:");
		int n=sc.nextInt();
		sc.nextLine();
		
		if(n<=0) {
			System.out.println("Invalid");
			return;
		}
		System.out.println("Enter the trip details:");
		for (int i=0;i<n;i++) {
			String input=sc.nextLine();
			String[] parts=input.split("/");
			String tripType=parts[0];
			int tripsCompleted=Integer.parseInt(parts[1]);
			double totalRevenue=Double.parseDouble(parts[2]);
			if(tripsCompleted<=0) {
				System.out.println("Trips should be a valid number");
				return;
			}
			templist.add(new TripStat(tripType,tripsCompleted,totalRevenue));
		}
		trip.setTripList(templist);
TripStat maxRecord = trip.findMax(trip.convertToStream());
        
        if (maxRecord != null) {
            System.out.println(maxRecord.getTripType() + " had the highest trip count with " + 
                               maxRecord.getTripsCompleted() + " trips");
        }
    }
}
