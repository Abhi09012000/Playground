#include<iostream>
using namespace std;
int main()
{
  int f_price,f_dis,f_sc,s_price,s_dis,s_sc,a_price,a_dis,a_sc;
  int f_total,s_total,a_total;
  cin>>f_price>>f_dis>>f_sc>>s_price>>s_dis>>s_sc>>a_price>>a_dis>>a_sc;
  f_total=(f_price-((f_price*f_dis)/100))+f_sc;
  s_total=(s_price-((s_price*s_dis)/100))+s_sc;
  a_total=(a_price-((a_price*a_dis)/100))+a_sc;
  cout<<"In Flipkart Rs."<<f_total<<"\n";
  cout<<"In Snapdeal Rs."<<s_total<<"\n";
  cout<<"In Amazon Rs."<<a_total<<"\n";
  if(f_total<=s_total && f_total < a_total )
  {
    cout<<"He will prefer Flipkart";
  }
  else if(s_total<a_total)
  {
    cout<<"He will prefer Snapdeal";
  }
  else
  {
    cout<<"He will prefer Amazon";
  }
}