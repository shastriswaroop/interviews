package shastri.swaroop.harman;

import java.util.LinkedHashMap;
import java.util.Map;

// Given array [1,2,22,1,3,3,33,555] print the occurentces of each 
// 1->2
// 2->3
// 3->4
// 5->3
public class CountOccrences {

	public static void main(String args[]) {
		int array [] = {1,2,22,1,3,3,33,555};
		Map<Integer,Integer> map = new LinkedHashMap();
		int count;
		int number;
		for(int i=0;i<array.length;i++) {
			count = 0;
			number = array[i];
//			count =  map.get(number);
			if(number<10) {
				map = updateMap(map,number);
			} else {
				while(number>0) {
					count++;
					number=number/10;
					if(number!=0 && number<10) {
						map = updateMap(map,number,++count);
					}
				}
			}
		}
		
		for(Map.Entry<Integer,Integer> entity: map.entrySet()) {
			System.out.println(entity.getKey() + " -> " +entity.getValue());
		}
		
		
	}
	private static Map<Integer,Integer> updateMap(Map<Integer, Integer> map, Integer number,Integer count){
		if(map!=null && number!=null) {
			Integer cnt=(Integer) map.get(number);
			if(cnt==null) {
				map.put(number, count);
				return map;
			}
			map.put(number, cnt+count);
			return map;
		}
		return null;

	}
	
	private static Map<Integer,Integer> updateMap(Map<Integer, Integer> map, Integer number){
		if(map!=null && number!=null) {
			Integer cnt=(Integer) map.get(number);
			if(cnt==null) {
				map.put(number, 1);
				return map;
			}
			map.put(number, ++cnt);
			return map;
		}
		return null;
	}
}
