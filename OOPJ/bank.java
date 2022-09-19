import java.util.Scanner;
class Bank
{
    
    int[] acc_num= new int[5];
    int v;
    String[] name = new String[5];
    double[] bal=new double[5];
    Scanner s = new Scanner(System.in);
    void get()
    {
      
        System.out.println("Enter Name");
        System.out.println("Enter Account No");
        System.out.println("Enter Balance");
        for(int i=0;i<5;i++)
        {
        System.out.println("Enter details of employee:"+i);
        name[i]=s.nextLine();
        acc_num[i]=s.nextInt();
        bal[i]=s.nextDouble();
        }
    }
   
    void display()
    {    
        for(int i=0;i<5;i++)
        {
        System.out.println("Name of the Account Holdder is: "+name[i]);
        System.out.println("The Account Number is: "+acc_num[i]);
        System.out.println("Balance of the Account is: "+bal[i]);
        }
     }   
        void search()
        {
                            
          System.out.println("Entert the account number to search the deatails of account holder: ");
          v=s.nextInt();
                for(int i=0;i<5;i++)
                {        
                        if(acc_num[i]==v)
                        {
                               System.out.println("Name of holder is ::"+name[i]);
                               System.out.println("Accunt number of holder is ::"+acc_num[i]);
                               System.out.println("Balance of holder is ::"+bal[i]);
                        }        
                
        
                }

        }
}

class bank
{
    public static void main(String args[])
    {
        Bank b = new Bank();
        b.get();
        b.display();   
        b.search();
        
    }
}
