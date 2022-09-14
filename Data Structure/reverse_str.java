import java.util.Stack;
 
public class ReverseString {
 
    public static void main(String[] args) {
 
          Scanner in = new Scanner(System.in);
          System.out.println("Enter a string");
 
          String str = in.nextLine();
 
          Stack stack = new Stack<>();
 
          for(int i = 0; i < str.length(); i++) {
               stack.push(str.charAt(i));
          }
 
          System.out.println("Reverse of a string");
 
        
          while(!stack.empty()) {
              System.out.print(stack.pop());
          }
      }
}
