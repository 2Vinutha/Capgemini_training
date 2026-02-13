package Training;
import java.util.*;
import java.util.stream.Stream;
public class TripUtility {
	private List<TripStat> tripList=new ArrayList<>();

	public List<TripStat> getTripList() {
		return tripList;
	}

	public void setTripList(List<TripStat> tripList) {
		this.tripList = tripList;
	}
	public Stream<TripStat> convertToStream(){
		return tripList.stream();
	}
	public TripStat findMax(Stream<TripStat> stream2) {
		return stream2.max(Comparator.comparingInt(TripStat::getTripsCompleted)).orElse(null);
	} 
}
