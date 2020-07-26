package shastri.swaroop.persistent;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTextFile {
	public static void main(String args[]) throws IOException {
		FileInputStream fins = null;
		DataInputStream dis = null;
		BufferedReader br = null;

		try {
			fins = new FileInputStream(new File("/home/swaroop/TextFile.txt"));
			dis = new DataInputStream(fins);
			br = new BufferedReader(new InputStreamReader(dis));
			while(br.readLine()!=null) {
				System.out.println(br.readLine());
			}		
			
			if(fins!=null) {
				fins.close();
			}
			
			if(dis!=null) {
				dis.close();
			}
			if(br!=null) {
				br.close();
			}

		} catch(FileNotFoundException fnf) {
			System.out.println("Not found");
		} catch(Exception ioe) {
			
		} finally {
			if(fins!=null) {
				fins.close();
			}
			
			if(dis!=null) {
				dis.close();
			}
			if(br!=null) {
				br.close();
			}

		}
	}
}
