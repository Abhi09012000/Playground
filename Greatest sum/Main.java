#include<iostream>
#include<cstdlib>
using namespace std;
int suma(int**,int,int);
int sumb(int**,int,int);
int main()
{ 
int m,n,**a,great=0,sum=0;
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
cout<<"Sum of rows is ";
for(int i=0;i<m;i++)
{
 cout<<suma(a,i,n)<<" ";
 if(suma(a,i,n)>sum)
 {
 great=i;
 sum = suma(a,i,n);
 }
}
cout<<endl;
cout<<"Row "<<great+1<<" has maximum sum"<<endl;
cout<<"Sum of columns is ";
sum = 0;
great =0;
for(int i=0;i<n;i++)
{
 cout<<sumb(a,i,m)<<" ";
 if(sumb(a,i,m)>sum)
 {
 great=i;
 sum = sumb(a,i,m);
 }
}
cout<<endl;
cout<<"Column "<<great+1<<" has maximum sum"<<endl;
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
int sumb(int** c,int m,int n)
{
 int sum=0;
for(int j=0;j<n;j++)
{
 sum=sum+ *(*(c+j)+m);
}
//cout<<sum<<" ";
return sum;
}
