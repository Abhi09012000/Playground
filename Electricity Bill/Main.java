#include<iostream>
using namespace std;
int main()
{
  int u_consumed,n,cost;
  cin>>u_consumed;
  if(u_consumed<=200)
  {
   cost=u_consumed*0.5;
   cout<<"Rs."<<cost;
  }
  else if(u_consumed<=400)
  {
    cost=u_consumed*0.65+100;
    cout<<"Rs."<<cost;
  }
  else if(u_consumed<=600)
  {
    cost=u_consumed*0.80+200;
    cout<<"Rs."<<cost;
  }
  else
  {
    cost=u_consumed*1.25+455;
    cout<<"Rs."<<cost;
  }
}