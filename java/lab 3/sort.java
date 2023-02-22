import java.util.*;
class sort
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        int i,j,temp;
        for(i=0;i<5;i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted list is ");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
