#include <iostream>

using namespace std;

bool isAfactor(int, int);

int main()
{
int startVal, endVal, num = 0, i, sum;
cin >> startVal;
cin >> endVal;
for (num = startVal; num <= endVal; num++)
	{
		sum = 0;
		for (i = 1; i < num; i++) 
		{
			if (num%i==0)
				sum = sum + i;
		}
		if (sum == num)
		{
			cout << num << " ";
		}
              
	}
}

