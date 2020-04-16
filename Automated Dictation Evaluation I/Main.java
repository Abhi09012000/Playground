#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s1[50];
  cin.getline(s1,50);
  char s2[50];
  cin.getline(s2,50);
  int n;
  n = strcmp(s1,s2);
  if(n==0)
  {cout<<"It is correct";}
  else
  {cout<<"It is wrong";}
}