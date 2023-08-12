package Online_Code_Samples.Week3;

public abstract class AbstractBoxClass implements BoxInterface {
    private int length;
    private int breadth;

    public AbstractBoxClass(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public abstract double perimeter();
}
