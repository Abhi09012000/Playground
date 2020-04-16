#include<iostream>
#include<string>
using namespace std;
int main()
{
 string s="front";
 string str;
 getline(cin,str);
 int r_no;
 cin>>r_no;
  if(str==s)
  {
    if(r_no==1)
    {cout<<"Left Handed";}
    else
    {cout<<"Right Handed";}
  }
  else
  {
    if(r_no==1)
    {cout<<"Right Handed";}
    else
    {cout<<"Left Handed";}
  }
}
