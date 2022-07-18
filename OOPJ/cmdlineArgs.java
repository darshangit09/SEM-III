//Swtich statement which takes 2 command line Arument first is string and you can pass the followimg values odd even average sum, second argument is the upper limit starting from 0.

public class cmdlineArgs
{
public static void main(String args[])
    {
    String even; 
    System.out.println("Choose your Operator: Even:Odd:Sum:Avg:");
    int x=Integer.parseInt(args[0]);
    switch(x)
{
    case even: for(int i=0;args[1]>=0;i--)
	       {
                  if(i%2==0)
			{
			System.out.println("Even Number");
			}
               }
    break;
    default :System.out.println("Invalid Operation");
        }
    }
}
