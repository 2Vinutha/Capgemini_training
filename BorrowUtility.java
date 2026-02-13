package Training;
import java.util.*;
import java.util.stream.Stream;
public class BorrowUtility {
	private List<BorrowRec> recList=new ArrayList<>();
	
	public List<BorrowRec> getRecList() {
		return recList;
	}

	public void setRecList(List<BorrowRec> recList) {
		this.recList = recList;
	}
public Stream<BorrowRec> convertToStream(){
	return recList.stream();
}
public BorrowRec findMax(Stream<BorrowRec> stream1) {
	return stream1.max(Comparator.comparingInt(BorrowRec::getCopiesBorrowed)).orElse(null);
}
}
