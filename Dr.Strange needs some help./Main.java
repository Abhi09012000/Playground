#include<iostream>
#include<cmath>
using namespace std;
int exp(int a, int b)
{ 
  int val=pow(a,b);
  return val;
}
int main()
{
  int m,n,req,eval;
  cin>>m>>n>>req;
  eval=exp(m,n);
  if(eval>=req)
  {cout<<"Doctor, you can proceed with your experiment.";}
  else
  {cout<<"Sorry Doctor! You need more bacteria.";}
}
  