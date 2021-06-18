#include <iostream>
using namespace std;

template <class T>
T biggest(T x[], int length) {
	T big = x[0];
	for (int i = 1; i < length; i++) {
		if (big < x[i])
			big = x[i];
	}
	return big;
}

int main() {
	int x[] = { 1, 10, 100, 5, 4 };
	cout << biggest(x, 5) << endl;

	double y[] = { 0.5, 2.3, 5.2, 1.6, 6.2 };
	cout << biggest(y, 5) << endl;
}