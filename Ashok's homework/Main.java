#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  int m1[r][c],m2[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>m1[i][j];
    }
  }
   for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      cin>>m2[i][j];
    }
  }
  int sum[r][c];
  for(int i=0;i<r;i++)
  {
    for(int j=0;j<c;j++)
    {
      sum[i][j]=m1[i][j]+m2[i][j];
      cout<<sum[i][j]<<" ";
      if(j==c-1)
      {cout<<endl;}
    }
  }
}