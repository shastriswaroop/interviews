package shastri.swaroop.oracle;

public class ThrowableTest {
	public static void main(String args[]) throws Throwable {
		String str = "4";
		try {
			System.out.println(Integer.parseInt(str));
		} catch(Exception ex) {
			throw new Throwable();
		}
	}
}
