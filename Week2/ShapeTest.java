package Online_Code_Samples.Week2;

public class ShapeTest{
    public static void main(String[] args) {
        Shape square = new Square(12);
        Shape circle = new Circle(7);

        System.out.printf("\nThe area of rectangle with %s is: %s", square.getLength(), square.area() );
        System.out.printf("\nThe area of circle with radius %s is: %s", circle.getRadius(), circle.area());
    }
}