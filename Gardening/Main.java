#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  cin>>r>>c>>n;
  if(n>r && n<=2*r)
  {
    cout<<"It is a mango tree";
  }
  else if(n>3*r && n<=4*r)
  {
    cout<<"It is a mango tree";
  }
  else
  {
    cout<<"It is not a mango tree";
  }

    
}