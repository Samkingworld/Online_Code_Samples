package Online_Code_Samples.Week2;

public class Addition {
    public static void main(String[] args) {
        int a = 3, b = 12;
        int max = getMaximum(a, b);
        System.out.printf("Maximum number is : %s", max);
    }

    public static int getMaximum(int x, int y){ //Method declaration
        return Math.max(x, y); //Math class static method 'max' called within
    }
}

