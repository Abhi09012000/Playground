#include<iostream>
using namespace std;
int main()
{
  int n,chance=3;
  float score=0;
  while(chance>0) 
  {
    cin>>n;
    if(n%2!=0 && n>0)
    {
      score=score+1;
      chance--;
    }
    if(n%2==0 && n>0)
    {
      score=score-0.5;
    }
    if(n<0)
    {
      chance=0;
      score=score-1;
    }
  }
  cout<<float(score);
}