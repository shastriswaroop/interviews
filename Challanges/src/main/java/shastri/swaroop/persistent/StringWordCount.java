package shastri.swaroop.persistent;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class StringWordCount {
	
	public static void main(String args[]) {
		String strWord = "HELLOWORLD";
		char []chArr = strWord.toCharArray();
		Map<Character,Integer> cntMap = new HashMap<Character,Integer>();
		Map<String,Integer> cnrStrMap = new HashMap<String,Integer>();
		Integer cnt;
		for(char ch :chArr ) {
			cnt = cntMap.get(ch);
			if(cnt!=null) {
				cntMap.put(ch,++cnt);
			} else {				 
				cntMap.put(ch,1);
			}
		}
		
		
		 for(Entry<Character,Integer> entry : cntMap.entrySet()) {
		 
			 System.out.println(entry.getKey() + " : " + entry.getValue()); 
		}
		 
		for(int i=0;i < strWord.length();i++) {
//			System.out.println(i);
			if(i==0 ) { 
				System.out.println(strWord.substring(0, 1));
			}  else if(i==strWord.length()-1) {
				System.out.println(strWord.substring(strWord.length()-2,strWord.length()-1));
				System.out.println(strWord.substring(strWord.length()-1,strWord.length()));
			}
			else {
				System.out.println(strWord.substring(i-1, i));
			}
		}
	}
}
