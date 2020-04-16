#include<iostream>
using namespace std;
int main()
{
  int n;
  float sum=0.5,i,c;
  cin>>n;
  c=n;
  cout<<"0.5 ";
  i=1.0;
  while(c!=1)
  {
    sum=sum+i;
    i=i*3;
    c--;
    cout<<sum<<" ";
  }
}
  