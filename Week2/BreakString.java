package Online_Code_Samples.Week2;

import java.util.ArrayList;
import java.util.List;

public class BreakString {

//    Break this String into protocol, host, and endpoint. "http://ingrydacademy.com/students

     static void breakString(String url){

        String protocol = url.substring(0, url.indexOf(":"));
        String host = url.substring(url.indexOf("//") + 2, url.lastIndexOf("/") );
        String endpoint = url.substring(url.lastIndexOf("/") + 1);

         System.out.println("Protocol: " + protocol);
         System.out.println("Host: " + host);
         System.out.println("Endpoint: " + endpoint);

    }
    public static void main(String[] args) {

        breakString("http://ingrydacademy.com/students");

        List<Object> strings = new ArrayList<>();
        strings.add("Me");
        strings.add("you");
        strings.add(new ArrayList<>());

        for( Object ob : strings){
            String str = (String) strings.get(0);

        }

    }
}
