#include <iostream>
#include <conio.h>
using namespace std;
    int main()
{   
    int num[10];
    string name[10], city[10];
    cout<<"Enter enrollement_no, Name and City for 5 students:";
    for(int i=1;i<=5;i++)
    {    
            cout<<endl;
            cout<<"Enter detail of Student"<<i<<":";
            cin>>num[i];
            cin>>name[i];
            cin>>city[i];
        
    }
    return 0;
}
