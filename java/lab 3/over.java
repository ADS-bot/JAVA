import java.util.*;
public class over{
    int a,b;
    over(){
        a=0;
        b=0;
    }
    over(int x,int y){
        a=x;
        b=y;
    }
    void display(){
        System.out.println("a="+a+" b="+b);
    }
    public static void main(String args[]){
        over o1 = new over();
        over o2 = new over(10,20);
        o1.display();
        o2.display();
    }
}