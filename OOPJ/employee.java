import java.util.Scanner;
class employee1
{
    
    int[] emp_num= new int[6];
    String[] name = new String[6];
    String[] deg=new String[6];
    void get()
    {
        Scanner s = new Scanner(System.in);      
        for(int i=1;i<6;i++)
        {
        System.out.println("Enter Name of Employee:"+i);
        name[i]=s.next();
        System.out.println("Enter Employee No");
        emp_num[i]=s.nextInt();
        System.out.println("Enter Degination of Employee");
        deg[i]=s.next();
        }
    }
}
class darsh extends employee1
{     
  
   
    void salary()
{    
      Scanner s = new Scanner(System.in); 
   
      int bp[]=new int[6];
      int hra[]=new int[6];  
       for(int i=1;i<6;i++)
        {
        System.out.println("Enter Basic pay of Employee:"+i);
        bp[i]=s.nextInt();
        System.out.println("Enter Home Rent Allowance");
        hra[i]=s.nextInt();
        }
          for(int i=1;i<6;i++)
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
  darsh q=new darsh();
  q.get();
  q.salary();
}
} 
