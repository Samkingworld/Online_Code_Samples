package Online_Code_Samples.Week2;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {

        int[] arrayTotal = new int[4];

        for( int i = 0; i < arrayTotal.length; i++ ){
            int total = 0;
            int count = 1;
            Scanner scanner = new Scanner(System.in);

            do{
                System.out.print("Please enter an integer: ");
                int entry = scanner.nextInt();
                total += entry;

                if( (count) % 5 == 0){
                    arrayTotal[i] = total;
                }
                count++;
            } while( count <= 5 );
        }
        int total = 0, count = 1;
        for( int x : arrayTotal ){
            System.out.println("Series " + count++ + " total = " + x);
            total += x;
        }
        System.out.println("Total Summation = " + total);
    }

}
