#include<iostream>
#include<cstdlib>
using namespace std;

int main()
{
  int n,m=0,f=0;
  cin>>n;
  int *p = (int *)malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
  {cin>>*(p+i);}
  for(int i=0;i<n;i++)
  {
    if(*(p+i)%2==0)
    {f=f+1;}
    else
    {m=m+1;}
  }
  cout<<m<<"\n"<<f;
  free(p);
return 0;
}