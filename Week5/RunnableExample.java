package Online_Code_Samples.Week5;


public class RunnableExample implements Runnable {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("This is printed in the implemented method of this Runnable!");
            System.out.printf("The sum of 3 and 4 is %d and printed from the implemented runnable object\n", (3+4));
        };

        Thread thread = new Thread(task);
        thread.start();

        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();
    }

    @Override
    public void run() {
        System.out.println("This is from the run method of the runnable interface being implemented");
    }
}
