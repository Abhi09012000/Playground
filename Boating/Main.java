#include<iostream>
using namespace std;
int main()
{
  int w_boat,n_adults,n_children;
  cin>>w_boat>>n_adults>>n_children;
  if(n_adults*75+n_children*30<w_boat)
     { cout<<"Boat is stable";}
  else
     { cout<<"Boat will drow";}
}