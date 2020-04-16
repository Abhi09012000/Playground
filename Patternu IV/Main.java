#include<iostream>
using namespace std;
int main()
{
  int a,c=0;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(i%2==0)
    {
      for(int j=a;j>=1;j--)
      {
          if(j!=a)
          {cout<<i;}
          else
          {cout<<i+1;}
      }
    }
    else
    {
      for(int j=a;j>=1;j--)
      {
          if(j!=1)
          {cout<<i;}
          else
          {cout<<i+1;}
      }
    }
      cout<<endl;
  }
}