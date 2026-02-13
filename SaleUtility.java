package Training;
import java.util.*;
import java.util.stream.Stream;
public class SaleUtility {
	private List<BottleSale> bottleList=new ArrayList<>();

	public List<BottleSale> getBottleList() {
		return bottleList;
	}

	public void setBottleList(List<BottleSale> bottleList) {
		this.bottleList = bottleList;
	}
	public Stream<BottleSale> convertToStream(){
		return bottleList.stream();
	}
	public BottleSale findMax(Stream<BottleSale> stream3) {
		return stream3.max(Comparator.comparingInt(BottleSale::getQuantitySold)).orElse(null);
	}
}
