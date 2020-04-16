#include<iostream>
using namespace std;
int gcd( int x, int y, int z)
{
  if(x%z==0 && y%z==0)
  {return z;}
  return gcd(x,y,z-1);
}
  
    
int main()
{
  int a,b,ans;
  cin>>a>>b;
  int smallest = (a<b)?(a):(b);
  ans = gcd(a,b,smallest);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<ans;
}