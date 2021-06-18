#include <iostream>
using namespace std;

template <class T>
void reverseArray(T x[], int length) {
	for (int i = 1; i < length - 1; i++) {
		T tmp = x[length - i];
		x[length - i] = x[i - 1];
		x[i - 1] = tmp;
	}
}

int main() {
	int x[] = { 1, 10, 100, 5, 4 };
	reverseArray(x, 5);
	for (int i = 0; i < 5; i++)
		cout << x[i] << " ";
}