#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,c=0,i;
  cin>>n;
  for(i=3;i<=n;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  cout<<c;
}