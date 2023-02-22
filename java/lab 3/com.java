import java.util.*;
class com
{
    public static void main(String args[])
    {
        int a =Integer.parseInt(args[0]);
        int b =Integer.parseInt(args[1]);
        int c =Integer.parseInt(args[2]);
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        
        if(a>b && a>c)
        {
            System.out.println("Largest no. is "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest no. is "+b);
        }
        else
        {
            System.out.println("Largest no. is "+c);
        }
    }
}