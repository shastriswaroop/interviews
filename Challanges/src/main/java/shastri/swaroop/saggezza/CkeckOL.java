package shastri.swaroop.saggezza;
// Compilation error
/*
Error:(6, 9) java: reference to Display is ambiguous
        both method Display(java.lang.String) in shastri.swaroop.saggezza.CkeckOL and method Display(java.lang.StringBuilder) in shastri.swaroop.saggezza.CkeckOL match
*/

public class CkeckOL {
    public static void main(String[] args) {
//        Display(null);
    }
    public static void Display(Object obj){
        System.out.println("Object");
    }

    public static void Display(String obj){
        System.out.println("String");
    }

    public static void Display(StringBuilder obj){
        System.out.println("StringBuilder");
    }
}