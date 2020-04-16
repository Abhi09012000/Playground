#include<iostream>
using namespace std;
int main()
{
  int m,tu,w,th,f,s,su,salary;
  cin>>su>>m>>tu>>w>>th>>f>>s;
  salary=(m+tu+w+th+f)*100;
  if(m>8 && m<24)
  {salary=salary+15*(m-8);}
  if(tu>8 && tu<24)
  {salary=salary+15*(tu-8);}
  if(w>8 && w<24)
  {salary=salary+15*(w-8);}
  if(th>8 && th<24)
  {salary=salary+15*(th-8);}
  if(f>8 && f<24)
  {salary=salary+15*(f-8);}
  if((m+tu+w+th+f)>40)
  {salary=salary+((m+tu+w+th+f)-40)*25;}
  if(s>0 && (m+tu+w+th+f)<40)
  {salary=salary+125*s;}
  if(su>0 && (m+tu+w+th+f)<40)
  {salary=salary+150*su;}
  cout<<salary;
 }
  
