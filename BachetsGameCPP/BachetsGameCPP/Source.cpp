#include <iostream>

using std::cin;
using std::cout;
using std::endl;

int main()
{
	int numStones;

	while (cin >> numStones)
	{
		bool* good = new bool[numStones + 1];

		int numChoice;
		int stones[10];

		cin >> numChoice;

		for (int i = 0; i < numChoice; i++)
		{
			cin >> stones[i];
		}

		good[0] = false;

		for (int i = 0; i <= numStones; i++)
		{
			good[i] = false;

			for (int j = 0; j < numChoice; j++)
			{
				if (i - stones[j] >= 0 && !good[i - stones[j]])
				{
					good[i] = true;
					break;
				}
			}
		}

		if (good[numStones] == true)
			cout << "Stan wins" << endl;
		else
			cout << "Ollie wins" << endl;

		delete[] good;
	}

	return 0;
}