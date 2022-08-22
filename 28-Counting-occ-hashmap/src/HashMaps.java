import java.util.*;
public class HashMaps {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,1,1,3,4,5,5,6,7,7,8);
		HashMap<Integer, Integer> map = new HashMap<>();
		int counter = 0;
		for(int i:list) {
			for(int j:list) {
				if(i==j)
					counter++;
			}
			map.put(i, counter);
			counter = 0;
		}
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+ " "+m.getValue());
		}
	}

}