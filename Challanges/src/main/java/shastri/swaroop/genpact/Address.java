package shastri.swaroop.genpact;

public class Address extends Home {
    public final void getMyAddress(){
        System.out.println("home Address called!!");
    }

    public static void main(String[] args){
        Home home = new Address();
        home.getMyAddress();

    }
}