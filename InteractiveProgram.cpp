// InteractiveProgram.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

int main()
{
	cout << "Enter a number" << endl;
	int val;
	cin >> val;
	if (val < 10)
	{
		cout << "Too small!" << endl;
	}
	else if (val >= 10)
	{
		cout << "Good enough" << endl;
	}
}

