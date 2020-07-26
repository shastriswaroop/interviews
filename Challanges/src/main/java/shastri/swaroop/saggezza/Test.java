package shastri.swaroop.saggezza;


// output is false
public class Test {
    public static void main(String[] args) {
        System.out.println(something());
    }

    static Boolean something(){
        while(true){
            try{
   //             System.out.println("try");
  //              int i = 1/0;
                return true;
            } catch (Exception ex){
                System.out.println("catch");
               // return true;
            }
            /*finally { System.out.println("finally");
                break; }*/
        }
//        System.out.println("return");
        return false;
    }

}
