import java.util.Scanner;
class Student
{
    
    int[] eno= new int[3];
    int[] examno =new int[3];
    String[] name=new String[3];
       void get()
       {
        Scanner s = new Scanner(System.in);      
        for(int i=1;i<3;i++)
        {
        System.out.println("Enter Enrollment no."+i);
        eno[i]=s.nextInt();
        System.out.println("Enter Exam No");
        examno[i]=s.nextInt();
        System.out.println("Enter Name of Student");
        name[i]=s.next();
        }
    }
}
class Exam extends Student
{   
    int a[]=new int[3];
    int b[]=new int[3];
    int c[]=new int[3];
    int r[]=new int[3]; 
    int t[]=new int[3]; 
    int y[]=new int[3]; 
   
	
   
    void result()
{  
    Scanner s = new Scanner(System.in);  
    for(int i=1;i<3;i++)
        {
        System.out.println("Enter Marks of "+name[i]+" out of 20");
        System.out.println("Enter Marks of OOPJ");
        a[i]=s.nextInt(); 
        System.out.println("Enter Marks of DF");
        b[i]=s.nextInt();
        System.out.println("Enter Marks of DLD");
        c[i]=s.nextInt();
        }  
   
   for(int i=1;i<3;i++)
   {
    r[i]= a[i]+b[i]+c[i];
    t[i]=r[i]/60;
    y[i]=t[i]*100;
    System.out.println("Result of "+name[i]+" is:"+y[i]);  
   }
    
}
}
class print_result
{
 public static void main(String args[])
{
  Exam p=new Exam();
  p.get();
  p.result();
}
} 

