import java.util.*;
public class Factorial 
{

    public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
        int number;
        long fact = 1;
        System.out.println("Enter a Number:");
        number=sc.nextInt(); 
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
