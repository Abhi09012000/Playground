#include<iostream>
int main()
{
  int max_weight,f_weight;
  std::cin>>max_weight;
  std::cin>>f_weight;
  if(f_weight<max_weight)
  {std::cout<<"Yes, you can enter.";} 
 
  else if(f_weight==max_weight)
  {std::cout<<"Yes, you can enter. Kindly use a rope.";}
  else
  {std::cout<<"Sorry, you can't enter";}
}