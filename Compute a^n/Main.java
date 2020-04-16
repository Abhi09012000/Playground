#include<iostream>
using namespace std;
int power(int x, int y)
{
  if(y==0)
  {return 1;}
  else
  {
    int p = x * power(x,y-1);
    return p;
  }
}
int main()
{
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  int ans = power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<ans;
}