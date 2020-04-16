#include<iostream>
using namespace std;
int main()
{
 int n;
  cin>>n;
  int i=0;
  do
  {
    n=n/10;
    i++;
   }while(n>0);
  cout<<i;
    
}