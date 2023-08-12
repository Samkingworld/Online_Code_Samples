package Online_Code_Samples.Week4;

public class ThreadException {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            try{
                Thread.sleep(2000);
                System.out.println(i);
            } catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
