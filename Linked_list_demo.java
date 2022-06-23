import java.util.*;

class LinkedList_demo
{
    public static void main(String[] args)
    {
        LinkedList<String> name = new LinkedList<>();

        name.add("Hello");
        name.add("Bhavin");
        
        for(int i=0; i<name.size(); i++)
        {
            System.out.println(name.get(i));
        }

     //   System.out.println(name.get(1));

    }
}