/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
int arraytype(int x, int* a)
{
    int count=0;
    for(int i=0;i<x;i++)
    {
        if((a[i]%2)==0)
        {count=count+1;}
    }
    if((x-count)==0)
    {return 1;}
    else if((x-count)==x)
    {return 2;}
    else
    {return 3;}
}

using namespace std;

int main()
{
int n;
cout<<"Enter the number of elements in the array"<<endl;
cin>>n;
int a[n];
cout<<"Enter the elements in the array"<<endl;
for(int i=0; i<n; i++)
{cin>>a[i];}
int res=arraytype(n,a);
cout<<"The array is ";
switch(res)
{
 case 1: cout<<"Even";break;
 case 2: cout<<"Odd";break;
 case 3: cout<<"Mixed";break;
}
}
