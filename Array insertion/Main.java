#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
int n,*a,pos,num;
cout<<"Enter the number of elements in the array"<<endl;
cin>>n;
a = (int*)malloc(n*sizeof(int));
cout<<"Enter the elements in the array"<<endl;
 for(int i=0;i<n;i++)
{
 cin>>*(a+i);
}
a = (int*)realloc(a,(n+1)*sizeof(int));
cout<<"Enter the location where you wish to insert an element"<<endl;
cin>>pos;
if(pos<=n+1)
{
cout<<"Enter the value to insert"<<endl;
cin>>num;
for(int i=n;i>=pos;i--)
{
 *(a+i)=*(a+i-1);
}
*(a+pos-1)=num;
cout<<"Array after insertion is"<<endl;
for(int i=0;i<n+1;i++)
{
 cout<<*(a+i)<<"\n";
}
}
else
{
 cout<<"Invalid Input";
}
}
