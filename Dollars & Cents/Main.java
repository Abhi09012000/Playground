#include<iostream>
using namespace std;
int main()
{
int d1,c1,d2,c2,d=0,c=0;
cin>>d1>>c1>>d2>>c2;
  if((c1+c2)<100)
  {d=d1+d2;
   c=c1+c2;
   cout<<d<<"\n"<<c;}
  else
  {d=d1+d2+1;
   c=(c1+c2-100);
  cout<<d<<"\n"<<c;}
}