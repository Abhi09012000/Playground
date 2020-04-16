#include<iostream>
using namespace std;
int main()
{
  int x,r,y;
 int si,t_amount;
  float d_si,f_amount;
  cin>>x;
  cin>>r;
  cin>>y;
  si=(x*(r*y))/100;
  cout<<si;
  t_amount=x+si;
  cout<<"\n"<<t_amount;
  d_si=(float)(si*2)/100;
  cout<<"\n"<<d_si;
  f_amount=(float)t_amount - d_si;
  cout<<"\n"<<f_amount;
  
}