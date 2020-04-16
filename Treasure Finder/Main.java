#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,pro,i,hcf=1,n;
  cin>>n1>>n2>>n3;
    // a is the largest
    if(n1>=n2 && n1>=n3)
    {
        if(n2>=n3)
        {
         cout<<"The treasure is in box which has number "<<n2;
        }
        else
        {
          cout<<"The treasure is in box which has number "<<n3;
        }
    }
    else if(n2>=n1 && n2>=n3)
    {
        if(n1>=n3)
        {
         cout<<"The treasure is in box which has number "<<n1;
        }
        else
        {
         cout<<"The treasure is in box which has number "<<n3;
        }
    }

    // c is the largest number of the three
    else if(n1>=n2)
    {
        cout<<"The treasure is in box which has number "<<n1;
    }
    else
    {
        cout<<"The treasure is in box which has number "<<n2;
    }
 pro=n1*n2*n3;
 for(i=2;i<=pro;i++)
 {
  if(n1%i==0 && n2%i==0 && n3%i==0)
  {
   hcf=i;
   break;
  }
 }
  cout<<"\nThe code to open the box is "<<hcf;
 }