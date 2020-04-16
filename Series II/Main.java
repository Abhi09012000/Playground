#include<iostream>
using namespace std;
int main()
{
  int n,c,i,a;
  cin>>n;
  c=n;
  i=11;
  while(c!=0)
  {
    a=i*i;
    i=i+4;
    c--;
    cout<<a<<" ";
  }
}
  