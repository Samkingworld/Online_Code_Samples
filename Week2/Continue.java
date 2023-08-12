package Online_Code_Samples.Week2;

public class Continue {
    public static void main(String[] args) {
        System.out.println("Output");
        for (int count = 0; count < 10; count++) {
            if (count % 3 == 0)
                continue;
            System.out.println("The value of y is: " + count);
        }
    }
}
/*
Exercises ( 30 minutes ) -----> Ends 2:45pm

Write a for-loop to count downwards from 15 to 1 and print it out.​

Write a while loop to print even numbers from 2 to 30.​

Write a do-while loop to print “Hello World” 5 times on separate lines.​
 */