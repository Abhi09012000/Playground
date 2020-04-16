#include<iostream>
using namespace std;
int main()
{
  int a,c=0,t=0;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
      t=t+i;
  }
  t=t*2;
  for(int i=a;i>=1;i--)
  {
      for(int j=a-(i-1)-1;j>=1;j--)
      {
          cout<<"-";
      }
      for(int j=a-(i-1)-1;j>=1;j--)
      {
          cout<<"-";
      }
      for(int j=1;j<=i;j++)
      {
          if(j!=1)cout<<"*";
          cout<<c+j;
      }
      for(int j=i;j>=1;j--)
      {
          cout<<"*";
          cout<<t-c-j+1;
      }
      c=c+i;
      cout<<endl;
  }
  
}