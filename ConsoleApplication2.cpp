// ConsoleApplication2.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <iostream>

using namespace std;

int main()
{
	int value = 0;
	while (value != 5)
	{
		cout << "Enter the number '5'" << endl;
		cin >> value;
	}

	cout << "Got it!" << endl;
}

