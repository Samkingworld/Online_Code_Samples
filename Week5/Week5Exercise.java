package Online_Code_Samples.Week5;

import java.util.*;

public class Week5Exercise {
    public static void main(String[] args) {
        //Task 1 - Create ArrayList with ten words
        String[] words = {"John", "Doe", "Jane", "Penny", "Jim", "Hulk", "Julia", "Joy", "Mike", "Pence"};
        List<String> stringList = new ArrayList<>(Arrays.asList(words));

        //Print-out before set method is called
        System.out.println("Print-out before set method is called");
        System.out.println(stringList);
        System.out.println();
        //Task 2 - looped algorithm to remove elements in indexes 2, 4, 6, 8
        for(String s: stringList){
            int index = stringList.indexOf(s);
            if(index%2 == 0 && index > 0){
                stringList.set(index, null);
            }
        }
        //Print-out after set method is called to set 'null' in some indexes
        System.out.println("Print-out after set method is called to set 'null' in some indexes");
        System.out.println(stringList);
        System.out.println();

        //Task 3 - create an array containing the words [boy, girl, man, woman]
        String[] replacementWords = {"boy", "girl", "man", "woman"};

        //Task 4 - replace the nulls with the words in the array created above
        int count = 0;
        for(String s: stringList){
            if( s == null ){
                int index = stringList.indexOf(null);
                stringList.set(index, replacementWords[count++]);
            }
        }
        //Print-out after null is set to replacement words created above
        System.out.println("Print-out after null is set to valid words from replacementWords object");
        System.out.println(stringList);
        System.out.println();

        //Task 5 - create a hashmap and populate with the content of the list (ArrayList)
        Map<Integer, String> stringMap = new HashMap<>();
        for(String s: stringList){
            int index = stringList.indexOf(s);
            stringMap.put(index, s);
        }

        //Task 6 - print out the content of the array showing index and content
        //Sample: The word + word + is at index + index
        for( Integer integer : stringMap.keySet()){
            System.out.println("The word " + stringMap.get(integer) + " is at index " + integer);
        }


    }
}
