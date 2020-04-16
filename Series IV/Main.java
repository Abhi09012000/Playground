#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  c=n-2;
  if(n>=1)
  {cout<<"0 ";}
  if(n>=2)
  {cout<<"2 ";}
  int i=3,a=2;
  while(c>0)
   {
    if(i%2==0)
    {
      a=a+(i-1)*2;
    }
    else
    {
      a=a+i*2;
    }
    i++;
    cout<<a<<" ";
    c--;
    }
      
}