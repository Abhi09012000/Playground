#include<iostream>
using namespace std;
int main()
{
  int n,n1,c=0;
  cin>>n;
  while(n>0)
  {
    cin>>n1;
    n=n-n1;
    c++;
  }
cout<<"The number of turns is "<<c;
    
}