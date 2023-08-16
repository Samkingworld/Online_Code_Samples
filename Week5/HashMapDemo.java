package Online_Code_Samples.Week5;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Student first = new Student("John", 25, 72);
        Student second = new Student("Jane", 27, 83);
        Student third = new Student("David", 35, 68);
        Student fourth = new Student("Joy", 30, 95);

        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put(first.getName(), first);
        studentMap.put(second.getName(), second);
        studentMap.put(third.getName(), third);
        studentMap.put(fourth.getName(), fourth);

        for(String key: studentMap.keySet()){
            System.out.println(studentMap.get(key));
        }

        System.out.println(studentMap.get("John"));
    }
}
