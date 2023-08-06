package Basics;

public class Interfaces implements car,person {

    public static void main(String[] args) {
    }
    @Override
    public void start() {
        System.out.println("my car is starting");
    }


//    in java ek class ke multiple prarents is not possible to tackle this problem interfaces are used
//    diamond problem
    }



interface car{
    void start();
}
interface person{
    void start();
}
