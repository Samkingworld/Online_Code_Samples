package Online_Code_Samples.Week2;

public abstract class Shape {
    //Class variables
    int length;
    double radius;

    //Methods
    public abstract double area(); //abstract method
    public int getLength(){ //implemented method
        return length;
    }
    public double getRadius(){ //implemented method
        return radius;
    }
}

