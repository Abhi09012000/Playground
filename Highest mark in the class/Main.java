#include<iostream>
using namespace std;
int main()
{
  int n,a[10],i;
  cin>>n;
  for(i=0;i<n;i++)
  {cin>>a[i];}
  int max=a[0];
  for(i=0;i<n;i++)
  {
    if(max<a[i])
    {max=a[i];}
    else
      continue;
  }
  cout<<max;
}
