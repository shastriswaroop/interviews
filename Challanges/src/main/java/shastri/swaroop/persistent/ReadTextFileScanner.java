package shastri.swaroop.persistent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFileScanner {
	public static void main(String args[]) throws FileNotFoundException {
		File fl = new File("/home/swaroop/TextFile.txt");
		Scanner sc = new Scanner(fl);
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
		
		
		  Scanner sc1 = new Scanner(System.in); while(sc1.hasNext()) {
		  System.out.println(sc1.hasNext()); }
		 	}
}
