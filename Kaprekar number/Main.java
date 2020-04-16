#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int n,sqr,b,c=0,power=0,temp,sum=0,i;
  cin>>n;
  temp=n;
  sqr=n*n;
  b=sqr;
  while(sqr!=0)
  {
    sqr=sqr/10;
    c++;
  }
  //now c has count of total no of digits in sqr
  for(i=1;i<c;i++)
   {
    power=pow(10,i);
    if(n==power)
    {continue;}
    sum=(b/power)+(b%power);
    if(sum==temp)
    break;
  }
    if(sum==temp)
    {cout<<"Kaprekar Number";}
    else
    {cout<<"Not a Kaprekar Number";}
}
   
   
