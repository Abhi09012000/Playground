#include<iostream>
using namespace std;
int gcd(int,int,int);
int main()
{
  int n1,n2,n3,res;
  cin>>n1>>n2>>n3>>res;
  if(gcd(n1,n2,n3)==res)
  {cout<<"Answer is correct.";}
  else
  {cout<<"Answer is wrong.";}
  return 0;
}


int gcd(int a, int b, int c)
{
  //to check smallest
  int smallest = ((a<b) && (a<c))?a:((b<c)?b:c);
  //to calculate(return) gcd
  for(int i=smallest; i>=1; i--)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {return i;}
  }
  return 0;
}
  