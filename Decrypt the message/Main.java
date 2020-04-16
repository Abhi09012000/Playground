#include<iostream>
using namespace std;
int main()
{
  int e_num,t_num,r_num;
  cin>>e_num>>t_num;
  r_num=e_num+t_num;
  int sum=0,i=1;
  while(i<r_num)
        {
          if(r_num%i==0)
          {sum=sum+i;}
    	   i++;
  	     }
  if(r_num==sum)
  {cout<<"They can read the message";}
  else
  {cout<<"They can't read the message";}
}
          