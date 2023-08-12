package Online_Code_Samples.Week3;

import java.awt.*;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void move(){
        System.out.println("Code_Samples.Week3.Animal is moving");
    }
    public void run(){
        System.out.println("Code_Samples.Week3.Animal is running");
    }
    public void speak(){
        System.out.println("Code_Samples.Week3.Animal makes a unique sound");
    }
}

class Cat extends Animal{
    private String name;
    private int age;
    private int numberOfLegs;

    public Cat(String name, int age, int numberOfLegs){
        super(name, age);       //Calling super comes before any other calls in the constructor
        this.numberOfLegs = numberOfLegs;
    }

    public Cat(String name, int age, int numberOfLegs, Color color){
        this(name, age, numberOfLegs); //Call to same class constructor for initialization
        color = new Color(255, 255, 255);
    }


    @Override
    public void move() {        //Override the move method of Code_Samples.Week3.Animal class
        System.out.println("Code_Samples.Week3.Cat is walking");
    }

    @Override
    public void run(){          //Override the run method of Code_Samples.Week3.Animal class
        System.out.println("Code_Samples.Week3.Cat is running");
    }

    @Override
    public void speak(){        //Override the speak method of Code_Samples.Week3.Animal class
        System.out.println("Code_Samples.Week3.Cat says meow");
    }
}
