#include<iostream>
#include<cstdlib>
using namespace std;
int suma(int**,int,int);
int sumZigZag(int,int,int**);
int main()
{
int m,n,**a,sum;
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
sum = sumZigZag(m,n,a);
cout<<"Sum of Zig-Zag pattern is "<<sum;
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
int sumZigZag(int m,int n,int** c)
{
 int sum=0;
sum=sum+suma(c,0,n);
if(m%2!=0&&n%2!=0&&m>1&&n>1)
{
 sum=sum+*(*(c+m/2)+n/2);
}
sum=sum+suma(c,m-1,n);
//cout<<sum<<" ";
return sum;
}