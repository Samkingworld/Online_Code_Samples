package Online_Code_Samples.Week3;

public class BoxClass extends AbstractBoxClass{

    public BoxClass(int l, int b){
        super(l, b);
    }

    @Override
    public double perimeter() {
        return 2 * (getLength() + getBreadth());
    }

    @Override
    public double area() {
        return getLength() * getBreadth();
    }

    public static void main(String[] args) {
        AbstractBoxClass boxInterface = new BoxClass(25, 20);

    }
}
