#include <iostream>
#include <string>
using namespace std;
struct Student
{
    int hour;
    int minute;
    int second;
};
int main()
{
  	struct Student a,b;
  	cin>>a.hour;
  	cin>>a.minute;
  	cin>>a.second;
  	cin>>b.hour;
  	cin>>b.minute;
  	cin>>b.second;
  	if(a.second<b.second)
  	{
  	    a.second+=60;
  	    a.minute--;
  	}
  	if(a.minute<b.minute)
  	{
  	    a.minute+=60;
  	    a.hour--;
  	}
  	cout<<(a.hour-b.hour)<<":"<<(a.minute-b.minute)<<":"<<(a.second-b.second);
}