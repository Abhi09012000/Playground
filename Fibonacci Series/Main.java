#include<iostream>
using namespace std;
int fib (int a)
{
  if(a==0)
  {return 0;}
  else if(a==1)
  {return 1;}
  else
  {
    int term = fib(a-1) + fib(a-2);
    return term;
  }
}
int main()
{
  int n;
  cin>>n;
  int x=fib(n-1);
  cout<<"The term "<<n<<" in the fibonacci series is "<<x;
}