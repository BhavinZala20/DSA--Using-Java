// Queues will perform function in FIFO manner
// FIFO = First In First Out

import java.util.*;

public class Queues_demo 
{
    public static void main(String[] args) 
    {
        Queue <String> name = new LinkedList<>();

        // to add element in queue
        name.add("Hello");
        name.add("Bhavin");
        System.out.println(name.peek());

        int len = name.size();
        for(int i=0; i<len; i++)
        {
            // remove function will show all elements and delete 1st elementn also
            System.out.println(name.remove());
        }
    }    
}

/*
    not flexible because to get mid elements we must past frint end elememts
 */
