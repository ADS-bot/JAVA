import java.util.*;
class Acc
{
    int acc_no;
    double balance;
    void disp()
    {
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}
class Person extends Acc
{
    String name;
    int aadhar_no;
    void getDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter aadhar number: ");
        aadhar_no = sc.nextInt();
        System.out.println("Enter account number: ");
        acc_no = sc.nextInt();
        System.out.println("Enter balance: ");
        balance = sc.nextDouble();
    }
    void disp()
    {
        System.out.println("Name: "+name);
        System.out.println("Aadhar number: "+aadhar_no);
        System.out.println("Account number: "+acc_no);
        System.out.println("Balance: "+balance);
    }
}
public class account
{
    public static void main(String args[])
    {
        Person p = new Person();
        p.getDetails();
        p.disp();
    }
}
