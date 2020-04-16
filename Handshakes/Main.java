#include<iostream>
using namespace std;

int main()
{
    //fill the code
    int num;
    cin >> num;
    int total = num * (num-1) / 2; // Combination nC2
    cout << total;
    return 0;
}