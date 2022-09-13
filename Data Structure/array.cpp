#include <iostream>
#include <conio.h>
using namespace std;
class student
{
    int num[10];
    string name[10], city[10];
    public:
    void getdata();
    void putdata();
};
   void student::getdata()
   {
    cout<<"Enter enrollement_no, Name and City for 5 students:";
    for(int i=1;i<=5;i++)
    {    
            cout<<endl;
            cout<<"Enter detail of Student"<<i<<":";
            cin>>num[i];
            cin>>name[i];
            cin>>city[i];
        
    }
   }
   void student::putdata()
   {
    for(int i=1;i<=5;i++)
    {    
        cout<<"Detail of Student"<<i<<":";
        cout<<num[i];
        cout<<name[i];
        cout<<city[i];
        cout<<endl;
    }   
   }
   
    int main()
{   
    student s;
    s.getdata();
    s.putdata();
    return 0;
}
