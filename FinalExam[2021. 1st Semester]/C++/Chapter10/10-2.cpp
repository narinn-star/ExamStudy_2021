#include <iostream>
using namespace std;

template <class T>
T equalArrays(T x[], T y[], int length) {
	for (int i = 0; i < length; i++) {
		if (x[i] != y[i])
			return false;
		else
			return true;
	}
}

int main() {
	int x[] = { 1, 10, 100, 5, 4 };
	int y[] = { 1, 10, 100, 5, 4 };
	if (equalArrays(x, y, 5)) cout << "같다";
	else cout << "다르다";
}