#include<iostream>
using namespace std;
int main()
{
  int s_val,i,n,count=0;
  cin>>s_val;
  cout<<s_val<<"\n";
  n=s_val;
  while(n>1)
  {
    if(n%2==0)
    {n=n/2;}
    else
    {n=3*n+1;}
    cout<<n<<"\n";
    count++;
  }
  cout<<count<<"\n";
}