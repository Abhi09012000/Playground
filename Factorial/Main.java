#include<iostream>
using namespace std;
int fact(int a)
{
if(a>0)
{ 
  int factorial= a*fact(a-1);
  return factorial;
}
  else
  return 1;
}
int main()
{
 int n,ans;
 cin>>n;
 ans=fact(n);
 cout<<"The factorial of "<<n<<" is "<<ans;
}