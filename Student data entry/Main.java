#include <iostream>
#include <cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   student s;
   cin.getline(s.name,50);
   cin>>s.roll;
   cin>>s.marks;
   cout<<endl;
   cout<<"Student Details"<<endl;
   cout<<"Name: "<<s.name<<endl;
   cout<<"Roll: "<<s.roll<<endl;
   cout<<"Marks: "<<s.marks;
}