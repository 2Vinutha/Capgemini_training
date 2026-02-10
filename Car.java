package Training;
import java.util.*;
public class Car{
	private TreeMap<String,Integer> carMap=new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	public TreeMap<String, Integer> getCarMap() {
		return carMap;
	}
 
	public void setCarMap(TreeMap<String, Integer> carMap) {
		this.carMap = carMap;
	}
	public void addCar(String name,int num) {
		carMap.put(name,num);   
	}
	public int carByName(String name) {
		if(carMap.containsKey(name)) {
			return carMap.get(name);
		}
		return -1;
	}
	public List<String> carByCount(int count){
		ArrayList<String> resList=new ArrayList<>();
		for(Map.Entry<String,Integer> entry:carMap.entrySet()) {
			if(entry.getValue()>=count) { 
				resList.add(entry.getKey());
			}
		}
		if(resList.isEmpty()) {
		return null;  
		}else {
			return resList;
		}
	}
	public int carSold() {
		int sum=0;
		carMap.values();
		for(int count:carMap.values()) {
			sum+=count; 
		}
		return sum;
	} 
}