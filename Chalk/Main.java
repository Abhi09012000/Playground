#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n_chalks,n_days;
  float x,y;
  cin>>n_chalks;
  n_days=n_days+n_chalks;
  x=n_chalks;
  y=1/sqrt(n_chalks);
  while(floor(x)>0)
  {
    x=x*y;
    n_chalks=n_chalks+x;
  }
  cout<<n_chalks;
}