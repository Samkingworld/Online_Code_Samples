package Online_Code_Samples.Week1;

public class Dog {
    private String name;		//achieve encapsulation by declaring variables as private
    private int age;

    public Dog(String name, int age) { //Class constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {	//getter method to access the private variable ‘name’. It’s return type
        return name;		//is String
    }

    public void bark() {	//void methods do not return any value and do not have a return type
        System.out.println("Woof!");

    }

    public static void main(String[] args) {
        Dog dog = new Dog("Alsatian", 2); //A dog object was created with name and age

        dog.bark(); //We use the dog object created to call the method 'bark()'
    }
}