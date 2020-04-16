#include <iostream>  
using namespace std;  
int main()  
{  
  int n, i, m=0, flag=0;  
  cin >> n;  
  m=n/2; 
  if(n==1)
  {cout<<"Not eligible";}
  else
  {
  for(i = 2; i <= m; i++)  
  {  
      if(n % i == 0)  
      {  
          cout<<"Not eligible"<<endl;  
          flag=1;  
          break;  
      }  
  }  
  if (flag==0)  
      cout << "Eligible"<<endl; 
  }
  return 0;  
}  
  