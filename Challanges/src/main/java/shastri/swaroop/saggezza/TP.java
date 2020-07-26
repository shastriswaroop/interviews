package shastri.swaroop.saggezza;


public class TP {
    public static void main(String[] args) {
        int iReturned = new TP().testMethoid();
        System.out.println(iReturned);
    }

    public int testMethoid(){
        int i = 0;
        try{
            i = 100/0;
            return i;
        } catch (Exception ex){
            i = 200/0;
            return i;
        }
        finally{
            i = 300;
        }

    }
/*
    Exception in thread "main" java.lang.ArithmeticException: / by zero
    at shastri.swaroop.saggezza.TP.testMethoid(TP.java:15)
    at shastri.swaroop.saggezza.TP.main(TP.java:5)
*/


}
