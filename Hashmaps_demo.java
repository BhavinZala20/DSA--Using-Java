import java.util.*;

public class Hashmaps_demo 
{
    public static void main(String[] args) 
    {
        HashMap <Integer, String> student = new HashMap<>();

        // variable_name(student).put(key, value);

        // student.get(key) => it will returns the values
        student.put(1, "Bhavin");
        student.put(2, "Abhishek");

        // to update key and value
        // student.get(key, value);
        student.get(1);

        int st = student.size();

        System.out.println(st);
    }
    
}
