#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(j!=1)
        cout<<"*";
      cout<<i;
    }
    
    cout<<endl;
  }
  
  
  for(i=n;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
       if(j!=1)
        cout<<"*";
      cout<<i;
    }
    
    cout<<endl;
  }
}