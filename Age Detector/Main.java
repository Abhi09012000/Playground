#include<iostream>
using namespace std;
int main()
{
 int b_year,c_year,age;
 cin>>b_year>>c_year;
	if(b_year>c_year)
      {
       age=(c_year+100)-b_year;
       cout<<age;
      }
    else
      {
       age=c_year-b_year;
       cout<<age;
      }
 }