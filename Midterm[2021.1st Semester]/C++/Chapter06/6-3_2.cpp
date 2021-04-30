#include <iostream>
using namespace std;

int big(int a, int b, int c = 100) {
	int MAX = c;
	int s;
	if (a > b)
		s = a;
	else
		s = b;
	if (s > MAX)
		return MAX;
	else
		return s;
}

int main() {
	int x = big(3, 5);
	int y = big(300, 60);
	int z = big(30, 60, 50);
	cout << x << " " << y << " " << z << endl;
}