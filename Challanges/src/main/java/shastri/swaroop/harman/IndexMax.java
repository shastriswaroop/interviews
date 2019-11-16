package shastri.swaroop.harman;


//Given array [1,4,11,3,7,9]
// 2->9
// 3->4
// nth -> ??

public class IndexMax {
	public static void main(String args[]) {
		int array[] = {1,4,11,3,7,9};
		for(int i=0; i<array.length;i++) {
			for(int j= i+1; j<array.length;j++) {
				if(array[j]>array[i]) {
					int tmp = array[j];
					array[j] = array[i];
					array[i] =tmp;
				}
			}
		}
		
/*		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
*/		// index
		int pos = 3;
		
		System.out.println(array[pos-1]);
	}
}
