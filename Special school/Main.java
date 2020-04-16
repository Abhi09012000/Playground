#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char s1[50];
  cin.getline(s1,50);
  char s2[50];
  cin.getline(s2,50);
  int j=strlen(s1)-1,temp;
  for(int i=0;i<j;i++,j--)
  {
    temp=s1[i];
    s1[i]=s1[j];
    s1[j]=temp;
  }
  if(strcmp(s1,s2)==0)
  {cout<<"It is correct";}
  else
  {cout<<"It is wrong";}
}