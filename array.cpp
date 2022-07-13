#include <iostream>
#include <string>
using namespace std; 
  class MyClass {      
  public:             
    int eNum;        
    string name;
    string city;	  
};

int main() 
{
  MyClass details;  
  details.eNum = 490; 
  details.name = "Darshan";
  details.city = "Surat";
 
  
  cout << details.eNum << "\n";
  cout << details.name << "\n";
  cout << details.city <<"\n";

  MyClass details1;  
  details1.eNum = 491; 
  details1.name = "Darsh";
  details1.city = "Surat";
 
  
  cout << details1.eNum << "\n";
  cout << details1.name << "\n";
  cout << details1.city <<"\n";

  return 0;
}
