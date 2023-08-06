package encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args) {


//    private only limited for this class;

//    public void doWork(){
//        System.out.println("working working");
//    }
        Laptop l=new Laptop();
        l.setPrice(26);

    }
}
class Laptop{
    int ram;
    private int price;
    public void setPrice(int price){
//        is the user Admin
        boolean isAdmin=false;
        if(!isAdmin){
            System.out.println("you cannot set the price");
        }else{
            this.price=price;
        }

    }
}
