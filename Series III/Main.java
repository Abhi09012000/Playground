#include<iostream>
using namespace std;
int main()
{
  int n,i,c,sum=0,j;
  cin>>n;
  c=n;
  i=6,j=0;
  while(c!=0)
  {
    i=i+5*j;
    j++;
    c--;
    cout<<i<<" ";
  }
}
    