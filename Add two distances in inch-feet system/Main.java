#include <iostream>
#include <string>
using namespace std;
struct Student
{
    float inch;
    int feet;
};
int main()
{
  	struct Student a,b;
  	cin>>a.feet;
  	cin>>a.inch;
  	cin>>b.feet;
  	cin>>b.inch;
  	if(a.inch+b.inch<12)
  	{
  	    cout<<(a.feet+b.feet)<<"\'-"<<(a.inch+b.inch)<<"\"";
  	}
  	else
  	{
  	    cout<<(a.feet+b.feet+1)<<"\'-"<<(a.inch+b.inch-12)<<"\"";
  	}
}