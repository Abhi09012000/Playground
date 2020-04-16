#include<iostream>
#include<cstdlib>
using namespace std;
int suma(int**,int,int);
int main()
{
int m,n,**a,great;
cin>>m>>n;
 a = (int**)malloc(m*sizeof(int*));
 for(int i=0;i<m;i++)
{
 *(a+i) = (int*)malloc(n*sizeof(int));
}
 for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
 cin>>*(*(a+i)+j);
 }
}
for(int i=0;i<m;i++)
{
 cout<<suma(a,i,n)<<"\n";
}
}
int suma(int** c,int m,int n)
{
 int sum=0;
for(int j=0;j<n;j++)
{
 sum=sum+ *(*(c+m)+j);
}
//cout<<sum<<" ";
return sum;
}
