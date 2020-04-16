#include<iostream>
#include<cstdlib>
using namespace std;
int** createArray(int,int);
int** getElement(int**, int,int);
int** addMatrix(int**,int**,int,int);
int main()
{
int m,n,**a,**b,**sum;
//cout<<"Enter the number of rows in the array"<<endl;
cin>>m;
//cout<<"Enter the number of columns in the array"<<endl;
cin>>n;
a = createArray(m,n);
b = createArray(m,n);
sum = addMatrix(a,b,m,n);
for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
 cout<<*(*(sum+i)+j)<<" ";
 }
 cout<<endl;
}
}
int** createArray(int m,int n)
{
 int **a;
 a = (int**)malloc(m*sizeof(int*));
 for(int i=0;i<m;i++)
{
 *(a+i) = (int*)malloc(n*sizeof(int));
}
a = getElement(a,m,n);
return a;
}
int** getElement(int** a,int m,int n)
{
 for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
 cin>>*(*(a+i)+j);
 }
}
return a;
}
int** addMatrix(int** c,int** d,int m,int n)
{
 int **a;
 a = (int**)malloc(m*sizeof(int*));
 for(int i=0;i<m;i++)
{
 *(a+i) = (int*)malloc(n*sizeof(int));
}
 for(int i=0;i<m;i++)
{
 for(int j=0;j<n;j++)
 {
 *(*(a+i)+j)= *(*(c+i)+j)+*(*(d+i)+j);
 }
}
return a;
}
