package Online_Code_Samples.Week2;

public class Array {

    //Let's write different arrays
    static Integer[] intArray = new Integer[]{1, 3, 4, 5, 6};
    static String[] stringArray = {"Mike", "Pence", "Peace", "John"};
    static Object[] objectArray = {new Dog("Rex", 3), 39, "Mike Pence"};


    public static void printArray(Object[] array) {
        for (Object obj : array) {
            System.out.println(obj.toString());
        }
        System.out.println("=========================================");
    }


    public static void main(String[] args) {
        printArray(intArray);
        printArray(stringArray);
        printArray(objectArray);
    }
}
