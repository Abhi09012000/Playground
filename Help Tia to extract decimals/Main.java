#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  string fnum;
  getline(cin,fnum);
  int n=fnum.size();
  cout<<"Floating part is : ";
  for(int i=0;i<n;i++)
  {
    if(fnum[i]=='.')
    {
      for(int j=i+1;j<n;j++)
      {cout<<fnum[j];}
    /*{fnum.assign(fnum,i+1,((fnum.size()-1)-i));
     break;}
    else
      continue;*/
    }
  }
}
