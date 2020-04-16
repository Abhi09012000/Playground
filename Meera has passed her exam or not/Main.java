#include<iostream>
using namespace std;
int main()
{
  int n,i,a[10],m;
  cin>>n;
  for(i=0;i<n;i++)
  {cin>>a[i];}
  cin>>m;
  for(i=0;i<n;i++)
  {
    if(m==a[i])
    {break;}
  }
  if(m==a[i])
    {cout<<"She passed her exam";}
    else
    {cout<<"She failed";}
}