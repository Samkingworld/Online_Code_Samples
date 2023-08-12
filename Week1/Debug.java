package Online_Code_Samples.Week1;

public class Debug {

    public static void main(String[] args) {
        int x = 10, y = 11;

        for (int j = 1; j < y; j++){
            System.out.println("First Loop: " + j);
        }

        while( x <= y){
            System.out.println( "Second Loop: " + x);
            x++;
        }
    }
}
