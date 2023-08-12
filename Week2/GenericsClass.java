package Online_Code_Samples.Week2;

import java.util.ArrayList;
import java.util.List;



public class GenericsClass<T extends Number>{

    private List<Integer> intElements;
    private List<Double> doubleElements;


    public GenericsClass(){
        this.intElements = new ArrayList<>();
        for( int i = 0; i < 20; i++){
            intElements.add(20 * i);
        }
    }

    public GenericsClass(Double doubles){
        this.doubleElements = new ArrayList<>();
        for(double i = 1.0; i < 20; i++){
            doubleElements.add(i + doubles);
        }
    }


    public static void main(String[] args) {

        GenericsClass<Integer> genericIntObject = new GenericsClass<>();
        GenericsClass<Double> genericDoubleObject = new GenericsClass<>(1.5);

        for(Number intNum: genericIntObject.intElements){
            if(intNum == null)
                break;
            System.out.printf("\nInteger numbers %s is: %s", intNum, intNum);
        }
        System.out.println();
        System.out.println();

        for(Number doubleNum: genericDoubleObject.doubleElements){
            if(doubleNum == null)
                break;
            System.out.printf("\nDouble numbers %s is: %s", doubleNum, doubleNum);
        }
    }
}
