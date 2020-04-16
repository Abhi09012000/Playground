#include<iostream>
using namespace std;
int main()
{
 int n,sum=0,a,copy;
  cin>>n;
  copy=n;
  while(n>0)
  {
    a=n%10;
    sum=sum+a;
    n=n/10;
  }
  if(copy%sum==0)
  {cout<<"Harshad Number";}
  else
  {cout<<"Not Harshad Number";}
}