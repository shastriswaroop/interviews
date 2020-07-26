package shastri.swaroop.harman;


// String is "abcd"
// string "dabc" is rotation
// string "adbc" is not
public class StingRotate {
	public static void main(String args[]) {
		String str1 ="abcd";
//		String str2 = "cbda";
		String str2 = "dabc";
		
		if(str1==null ||  str2==null) {
			System.out.println("False");
			
		} else {
			
			if(str1.length()!=str2.length()) {
				System.out.println("False");
			} else {
				String lStr, rStr, fStr;
				int count = 1;
				while(count<str2.length()) {
					lStr	= str2.substring(count);
					rStr = str2.substring(0,count);
					count++;
//					System.out.println(lStr + " , "+ rStr);
					
					if(str1.equalsIgnoreCase(lStr+rStr)) {
						System.out.println("strings can be converted to each other");
						break;
					}
				}
				
			}
			
		}
		
	}
}
