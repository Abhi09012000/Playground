#include<iostream>
#include<string.h>
using namespace std;
int main ()
{
    char str[100];
    int count = 0, i; 
    cin.getline(str,100);
    for (i = 0; str[i] != '\0';i++)
    {
        if (str[i] == ' ')
            count++;    
    }
    if(count<10)
    {cout<<"Caption eligible for the contest";}
    else
    {cout<<"Caption not eligible for the contest";}
    return 0;
}