#include<iostream>
using namespace std;
int main()
{
  int n_items;
  float h_time;
  cin>>n_items>>h_time;
  if(n_items==2)
  {
    h_time=h_time+((h_time*50)/100);
    cout<<h_time;
  }
  if(n_items==3)
  {
    h_time=2*h_time;
    cout<<h_time;
  }
  if(n_items>3)
  {
    cout<<"Number of items is more";
  }
    
}