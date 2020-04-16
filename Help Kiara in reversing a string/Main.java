#include <iostream>
using namespace std;
#include<string.h>
int main()
{
char str[100],rev[100];         
{cin.getline(str,100);}
  int j = strlen(str) - 1,temp;
    for (int i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
  cout<<str;
}