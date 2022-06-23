// stacks performes the operations in LIFO formate
// LIFO = Last In First Out

import java.util.*;

class a1
{
    public static void main(String s[])
    {
        Stack<Integer> num = new Stack<>();

        // push function will add elements in stack
        num.push(1);
        num.push(3);
        num.push(5);
        num.push(7);
        num.push(9);

        //peek method will show us to peek element of t stack which in our case is 9
        System.out.println(num.peek());


        int len = num.size();
        for(int i=0; i<len; i++)
        {
            System.out.println(num.pop());
        } 


    }
}

/*
  stack will help us to search our history because recent element we find easily

  not much flexible because if we want to get inserted element,
  so we must pop last element of stack

  and all operations are related with top element only

 */