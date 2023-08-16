package Online_Code_Samples.Week5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Initialization of ArrayList
        List<Integer> intList = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            intList.add(i);
        }
        System.out.println(intList); //Output: [1, 2, 3, 4, 5]
        intList.remove(4);
        System.out.println(intList); //Output: [1, 2, 3, 4]
        intList.add(4, 6);
        System.out.println(intList); //Output: [1, 2, 3, 4, 6]
        intList.set(2, 5);
        System.out.println(intList); //Output: [1, 2, 5, 4, 6]
        System.out.println(intList.contains(4)); //true
        intList.clear();
        System.out.println(intList); //[] *empty list*
    }
}
