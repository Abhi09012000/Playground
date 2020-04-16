#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string line;
  getline(cin,line);
  int vowels=0,consonants=0,digits=0,spaces=0,symbols=0;
  for(int i=0; i<line.size(); i++)
  {
  if(line[i]=='a' || line[i]=='e' || line[i]=='i' ||
           line[i]=='o' || line[i]=='u' || line[i]=='A' ||
           line[i]=='E' || line[i]=='I' || line[i]=='O' ||
           line[i]=='U')
        {
            ++vowels;
        }
        else if((line[i]>='a'&& line[i]<='z') || (line[i]>='A'&& line[i]<='Z'))
        {
            ++consonants;
        }
        else if(line[i]>='0' && line[i]<='9')
        {
            ++digits;
        }
        else if (line[i]==' ')
        {
            ++spaces;
        }
        else
        {
            ++symbols;
        }
}
  cout<<"Vowels:"<<vowels<<endl;
  cout<<"Consonants:"<<consonants<<endl;
  cout<<"White Spaces:"<<spaces<<endl;
  cout<<"Digits:"<<digits<<endl;
  cout<<"Symbols:"<<symbols<<endl;
}
