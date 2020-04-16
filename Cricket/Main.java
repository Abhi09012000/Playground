#include<iostream>
#include<iomanip>
using namespace std;
int main()

{
int t_balls,t_runs,runs,balls,x,y;
 float b_left,o_finished,crr,trr,t_overs=50;
  cin>>t_balls>>t_runs>>runs>>balls;
  cout<<t_overs;
  x=(float)balls/6.0;
  y=balls%6;
  o_finished = x+(0.1*y)  ;
  cout<<"\n"<<o_finished;
  crr=runs/o_finished;
  cout<<"\n"<<fixed<<std::setprecision(1)<<crr;
  trr=t_runs/50.0;
  cout<<"\n"<<trr;
  if(crr<trr)
  {
    cout<<"\nNot Eligible to Win";
  }
  else
  {
    cout<<"\nEligible to Win";
  }
}