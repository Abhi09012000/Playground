#include<iostream>
using namespace std;
int main()
{
  int n,f_digit,l_digit;
  cin>>n;
  
 f_digit=n/1000;
  l_digit=n%10;

  cout<<f_digit+l_digit;
}