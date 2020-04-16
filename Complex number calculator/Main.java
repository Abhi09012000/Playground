#include <iostream>
using namespace std;
struct number
{ int r_part;
  int i_part;
};
int main()
{
  int choice;
  cin>>choice;
  number n1,n2;
  cin>>n1.r_part;
  cin>>n1.i_part;
  cin>>n2.r_part;
  cin>>n2.i_part;
  int realadd = n1.r_part + n2.r_part;
  int imagadd = n1.i_part + n2.i_part;
  int realsub = n1.r_part - n2.r_part;
  int imagsub = n1.i_part - n2.i_part;
  int x= (n1.r_part*n2.r_part)-(n1.i_part*n2.i_part);
  int y= (n1.r_part*n2.i_part)+(n1.i_part*n2.i_part);
  switch(choice)
  {
    case 1: {if(imagadd>=0)
               {cout<<realadd<<"+"<<imagadd<<"i";}
             else
               {cout<<realadd<<"-"<<imagadd<<"i";}
             }break;
                
    case 2: {if(imagsub<0)
               {cout<<realsub<<"+"<<"("<<imagsub<<")"<<"i";}
             else
               {cout<<realsub<<"+"<<imagsub<<"i";}
             }break;
   
    case 3: {if(y>0)
               {cout<<x<<"+"<<y<<"i";}
             else
               {cout<<x<<y<<"i";}
            }break;
            
      default : cout<<"Invalid choice";
  }
}
      
      