#include <iostream>
#include <string>
#include <stack>
using namespace std;
 
int evalPostfix(string exp)
{
    
    stack<int> stack;
 
    for (char c: exp)
    {

        if (c >= '0' && c <= '9') {
            stack.push(c - '0');
        }

        else {
            
            int x = stack.top();
            stack.pop();
 
            int y = stack.top();
            stack.pop();
 
            
            
            if (c == '+') {
                stack.push(y + x);
            }
            else if (c == '-') {
                stack.push(y - x);
            }
            else if (c == '*') {
                stack.push(y * x);
            }
            else if (c == '/') {
                stack.push(y / x);
            }
        }
    }
 
   
       return stack.top();
}
 
int main()
{
    string exp = "532+*";
 
    cout << evalPostfix(exp);
 
    return 0;
}
