import java.util.*;
public class array
{
 public static void main(String Args[])
 {
  Scanner a= new Scanner(System.in); 
  int marks[]= new int[10];
  int temp=0,n=4;
  System.out.println("Enter marks of Students");
  for(int i=0;i<=n;i++)
   {
    marks[i]=a.nextInt();
   }
    for(int i=0;i<=n;i++)
     {
       for(int j=i+1;j<=n;j++)
      {
      if(marks[i]<marks[j])
       {
         temp =marks[i];
         marks[i]=marks[j];
         marks[j]=temp;
       }
      }
     }
        for(int i=0;i<=n;i++)
         {
           System.out.println(""+marks[i]); 
         } 
 }
}
