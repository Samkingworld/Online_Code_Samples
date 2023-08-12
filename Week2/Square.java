package Online_Code_Samples.Week2;

public class Square extends Shape {
    private final int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public double area() {
        return length * length;
    }
}