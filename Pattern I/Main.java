#include<iostream>
using namespace std;
int main()
{
  int n,temp1=0,temp2=0,i,j;
  cin>>n;
  temp1=n;
  for(i=1;i<=4;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<temp1;
    }
    temp1=temp1+1;
    cout<<endl;
  }
  
  temp2=n+3;
  for(i=4;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      cout<<temp2;
    }
    temp2=temp2-1;
    cout<<endl;
  }
}