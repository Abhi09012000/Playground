#include <iostream>
#include <string>
#include <cstring>
using namespace std;
struct Student
{
    char name[30];
    char department[20];
    int yearOfStudy;
    float cgpa;
};
int main()
{
  	int n;
  	cout<<"Enter the number of students"<<endl;
    cin>>n;
    struct Student a[n];
    for(int i=0;i<n;i++)
    {
  		cout<<"Enter the details of student "<<i+1<<endl;
      	cout<<"Enter name"<<endl;
    	cin.getline(a[i].name, 100);
    	cin.getline(a[i].name, 100);
    	cout<<"Enter department"<<endl;
    	cin.getline(a[i].department, 100);
    	cout<<"Enter year of study"<<endl;
    	cin>>a[i].yearOfStudy;
    	cout<<"Enter cgpa"<<endl;
    	cin>>a[i].cgpa;
    }
    int count=1;
  	cout<<"Details of students"<<endl;
  	int z[n];
  	int great=0;
  	for(int i=0;i<n;i++)
        {
            int count=0;
  		    for(int j=0;j<n;j++)
             {
  		         if(memcmp(a[i].name,a[j].name,30)<0)
  		         {
  		            count++;
  		         }
             }
             z[i]=count;
             if(count>great)
             {
                 great = count;
             }
        }
        for(int i=great;i>=0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(z[j]==i)
                {
                    cout<<"Student "<<count++<<endl;
            	    cout<<"Name:"<<a[j].name<<endl;
            	    cout<<"Department:"<<a[j].department<<"\n";
            	    cout<<"Year of study:"<<a[j].yearOfStudy<<"\n";
   	        	    cout<<"CGPA:"<<a[j].cgpa<<endl;
                }
            }
        }
}