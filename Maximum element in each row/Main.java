#include<iostream>
#include<cstdlib>
using namespace std;
int greate(int**,int,int);
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
 great = greate(a,i,n);
 cout<<great<<"\n";
}
}
int greate(int** c,int m,int n)
{
 int great=0;
for(int j=0;j<n;j++)
{
 if(*(*(c+m)+j)>great)
 {
 great = *(*(c+m)+j);
 }
}
return great;
}
