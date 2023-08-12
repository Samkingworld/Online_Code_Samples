package Online_Code_Samples.Week4;

import java.util.Arrays;

public class IndexOut {

    public static void main(String[] args) {
        int[] intArray = new int[5];

        for( int i = 0; i < 5; i++){
            intArray[i] = i * 10;
        }

        System.out.println(Arrays.asList(intArray).toString());
    }
}
