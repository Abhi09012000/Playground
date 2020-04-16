#include <iostream>
using namespace std;
int main() 
{
  int n,a,b=0;
  cin>>n;
  while(n>0)
  {
    a=n%10;
    b=b*10+a;
    n=n/10;
  }
  cout<<b;
}