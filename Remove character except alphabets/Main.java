#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string s,s1;
  getline(cin,s);
  int n= s.size();
  for(int i=0;i<n;i++)
  {
    if(!((s[i]<'A' || s[i]>'Z') && (s[i]<'a' || s[i]>'z')))
    {s1.push_back(s.at(i));}
     
  }
  cout<<s1;
}