#include<iostream>
using namespace std;
int queue(int x, int y, int* a)
{
  int sum=0;
  for(int i=0; i<x; i++)
  {
    sum=sum+a[i];
  }
  if((sum/y)>1)
  {
    return sum/y+1;
  }
  else
  {
    return 1;
  }
}
    
  
  
int main()
{
  int n,m,res;
  cin>>n>>m;
  int a[n];
  for(int i=0; i<n; i++)
  {cin>>a[i];}
  res= queue(n,m,a);
  cout<<res;
}