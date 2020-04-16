#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int p_available,distance;
  cin>>mileage>>p_available>>distance;
  if((p_available*mileage)<distance)
  {cout<<"Cannot reach";}
  else
  {cout<<"Can reach";}
}