package Basics;

public class Abstraction {
    public static void main(String[] args) {
        Audi a1=new Audi();
        a1.start();
    }
}
class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi Car is Starting");

    }
}
class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW Car is Starting");

    }
}
abstract class Car{
    int price;
   abstract void start();
   void breaks(){
       System.out.println("Car is Breaking");
   }
}
