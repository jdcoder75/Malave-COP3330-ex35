package ex35;
import java.util.*;
import java.util.Random;
/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Jose Malave
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in  = new Scanner(System.in);
        Random rand = new Random();

        List list = new ArrayList( );

        boolean loop = true;
        while(loop)
        {
            System.out.println("Enter a name:");
            String s = in.nextLine( );

            if(s.equals("")|s.equals("pl exit"))
            {
                break;
            }
            else
            {
                list.add(s);
            }
        }

        int size = list.size();

        int int_random = rand.nextInt(size);
        System.out.println("The winner is..." + list.get(int_random));

    }
}
