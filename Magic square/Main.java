#include<iostream>
#include<cstdlib>
using namespace std;
int suma(int**,int,int);
int sumb(int**,int,int);
int sumc(int**,int);
int sumd(int**,int);
int main()
{
int m,**a,sum,count=0;
cin>>m;
 a = (int**)malloc(m*sizeof(int*));
 for(int i=0;i<m;i++)
{
 *(a+i) = (int*)malloc(m*sizeof(int));
}
 for(int i=0;i<m;i++)
{
 for(int j=0;j<m;j++)
 {
 cin>>*(*(a+i)+j);
 }
}
sum=suma(a,1,m);
//cout<<sum;
for(int i=0;i<m;i++)
{
 if(suma(a,i,m)==sum)
 {
 count++;
 }
}
for(int i=0;i<m;i++)
{
 if(sumb(a,i,m)==sum)
 {
 count++;
 }
}
if(sumc(a,m)==sum)
 {
 count++;
 }
if(sumd(a,m)==sum)
 {
 count++;
 }
if(count==((m*2)+2))
{
 cout<<"Yes";
}
else
{
 cout<<"No";
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
int sumc(int** c,int m)
{
 int sum=0;
for(int i=m-1;i>=0;i--)
{
 sum=sum+ *(*(c+i)+(m-1-i));
}
//cout<<sum<<" ";
return sum;
}
int sumd(int** c,int m)
{
 int sum=0;
for(int i=0;i<m;i++)
{
 sum=sum+ *(*(c+i)+i);
}
//cout<<sum<<" ";
return sum;
}