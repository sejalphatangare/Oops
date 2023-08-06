package Basics;

import encapsulation.EncapsulationIntro;

public class MainClass {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.name="Sejal";
        p1.age=19;
        System.out.println(p1.name+p1.age);

        Person p2=new Person(31,"Pranita");
//        p2.age=24;
//        p2.name="Anuj";
        System.out.println(p2.name+p2 .age);
        p1.eat();
        p2.walk();
        p2.walk(26);
        System.out.println("No of Object: "+Person.count);
//        Developer d1=new Developer(24,"Anuj");
//        d1.eat();
//        d1.walk();
//        d1.code();
//        EncapsulationIntro obj=new EncapsulationIntro();
//        obj.doWork();


    }
}
class Person{
    protected String name;
     int age;
     static int count;

     public Person(){
         count++;
         System.out.println("creating a object");
     }
//     public Person(int newAge,String newName){
//         this();
//         name=newName;
//         age=newAge;
//     }
     public Person(int age,String name){
         this();
         this.name=name;
         this.age=age;
     }
     void walk(){
         System.out.println(name+"is walking");
     }
     void eat(){
         System.out.println(name+"is eating");
     }
     void walk(int steps){
         System.out.println(name+ " walked "+steps+" steps");
     }
     void doWork(){
         System.out.println(name+" is Working");
     }



}

class Developer extends Person{
    public Developer(int age,String name){
        super(age,name);
    }
    void code(){
        System.out.println(name+" is Coding");
    }
}