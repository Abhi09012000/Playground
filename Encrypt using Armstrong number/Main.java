#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int sum=0,copy,count=0;
    copy=n;
    while(n>0)
    {
      n=n/10;
      count++;
    }
  n=copy;
  while(n>0)
  {
    int temp=n%10;
    sum=sum + power(temp,count);
    n=n/10;
  }
  if(copy==sum)
  {return 1;}
  else
  {return 0;}
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}