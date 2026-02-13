package Training;

public class TripStat {
	private String tripType;
	private int tripsCompleted;
	private double totalRevenue;
	public TripStat(String tripType,int tripsCompleted,double totalRevenue) {
		this.tripType=tripType;
		this.tripsCompleted=tripsCompleted;
		this.totalRevenue=totalRevenue;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	public int getTripsCompleted() {
		return tripsCompleted;
	}
	public void setTripsCompleted(int tripsCompleted) {
		this.tripsCompleted = tripsCompleted;
	}
	public double getTotalRevenue() {
		return totalRevenue;
	}
	public void setTotalRevenue(double totalRevenue) {
		this.totalRevenue = totalRevenue;
	}
}
