#include<iostream>
using namespace std;
int printresult(int* a, int x, int y)
{
  int sum=0;
  for(int i=0;i<x;i++)
  {
    sum=sum+a[i];
  }
  if(y-sum>=0)
  {return 1;}
   return 0;
}
int main()
{
  int n_mugs,v_cup,res;
  cin>>n_mugs>>v_cup;
  int a[n_mugs];
  for(int i=0;i<n_mugs;i++)
  {cin>>a[i];}
  res=printresult(a,n_mugs,v_cup);
  if(res==1)
  {cout<<"YES";}
  else
  {cout<<"NO";}
}