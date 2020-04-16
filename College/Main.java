#include <iostream>
#include <string>
using namespace std;
struct Student
{
    char name[100];
    char city[100];
    int establishmentYear;
    float passPercentage;
};
int main()
{
  	int n;
  	cout<<"Enter the number of colleges"<<endl;
    cin>>n;
    struct Student a[n];
    for(int i=0;i<n;i++)
    {
  		cout<<"Enter the details of college "<<i+1<<endl;
      	cout<<"Enter name"<<endl;
    	cin.getline(a[i].name, 100);
    	cin.getline(a[i].name, 100);
    	cout<<"Enter city"<<endl;
    	cin.getline(a[i].city, 100);
    	cout<<"Enter year of establishment"<<endl;
    	cin>>a[i].establishmentYear;
    	cout<<"Enter pass percentage"<<endl;
    	cin>>a[i].passPercentage;
    }
  	cout<<"Details of colleges"<<endl;
    for(int i=0;i<n;i++)
    {
  		cout<<"College:"<<i+1<<endl;
    	cout<<"Name:"<<a[i].name<<endl;
    	cout<<"City:"<<a[i].city<<"\n";
    	cout<<"Year of establishment:"<<a[i].establishmentYear<<"\n";
   		cout<<"Pass percentage:"<<a[i].passPercentage<<endl;
    }
}