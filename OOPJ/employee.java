import java.util.Scanner;
class employee1
{
    
    int[] emp_num= new int[5];
    String[] name = new String[5];
    String[] deg=new String[5];
    void get()
    {
        Scanner s = new Scanner(System.in);      
        for(int i=1;i<=5;i++)
        {
        System.out.println("Enter Name of Employee");
        name[i]=s.nextLine();
        System.out.println("Enter Employee No");
        emp_num[i]=s.nextInt();
        Scanner s1 = new Scanner(System.in); 
        System.out.println("Enter Degination of Employee");
        deg[i]=s1.nextLine();
        }
    }
}
class salary extends employee1
{     
  
   
    void salary()
{    
      Scanner s = new Scanner(System.in); 
   
      int bp[]=new int[5];
      int hra[]=new int[5];  
      System.out.println("Enter Basic pay of Employee");
      System.out.println("Enter Home Rent Allowance");
       for(int i=1;i<=5;i++)
        {
        System.out.println("Enter details of employee:"+i);
        bp[i]=s.nextInt();
        hra[i]=s.nextInt();
        }
          for(int i=1;i<=5;i++)
        {
         int salary=bp[i]+hra[i]*bp[i]+hra[i];
         System.out.println("Salary of Employee:"+i+"is"+salary);
        }
}
} 
class employee
{
 public static void main(String args[])
{
  salary q=new salary();
  q.get();
  q.salary();
}
} 
