import java.util.*;
class occur
{
    public static void main(String args[])
    {
        int a[] = new int[5];
        int i,j,count;
        for(i=0;i<5;i++)
        {
            a[i] = Integer.parseInt(args[i]);
        }
        for(i=0;i<5;i++)
        {
            count = 1;
            for(j=i+1;j<5;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    a[j] = -1;
                }
            }
            if(a[i]!=-1)
            {
                System.out.println(a[i]+" occurs "+count+" times");
            }
        }
    }
}