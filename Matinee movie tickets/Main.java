#include<iostream>
using namespace std;
int main()
{
 int age;
 float s_time;
  cin>>age>>s_time;
if (s_time>12)
 {
  if(age>13)
  {cout<<"$5.00";}
  else
  {cout<<"$2.00";}
 }
 else
  {
    if(age>13)
  {cout<<"$8.00";}
  else
  {cout<<"$4.00";}
  }
}