import java.util.Scanner;
class Bank
{
    int acc_num;
    String name;
    double bal;
    Scanner s = new Scanner(System.in);
    void get()
    {
        System.out.println("Enter Name");
        name = s.next();

        System.out.println("Enter Account No");
        acc_num = s.nextInt();
  
        System.out.println("Enter Balance");
        bal = s.nextDouble();
    }
   
   void deposite()
    {
        int amt;
        System.out.println("Enter amount you want to deposite");
        amt = s.nextInt();
        
        bal = bal + amt;               
    }

    void withdraw()
    {
        int amt;
        System.out.println("Enter amount you want to withdraw");
        amt = s.nextInt();
        
        bal = bal - amt;
    }

    void display()
    {
        System.out.println("Name of the Account Holdder is: "+ name);
        System.out.println("The Account Number is: "+ acc_num);
        System.out.println("Balance of the Account is: "+ bal);
    }
}

class bank
{
    public static void main(String a[])
    {
        Bank b = new Bank();

        b.get();
        b.deposite();
        b.display();
        b.withdraw();
        b.display();   
    }
}
