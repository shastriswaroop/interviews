package shastri.swaroop.saggezza;
// out put is 20,20,20

enum Enums
{
    D, E, S;
    private Enums(){
        System.out.println(20);
    }
}

public class MainClass {
    public static void main(String[] arr){
        Enums en = Enums.E;
    }
}
