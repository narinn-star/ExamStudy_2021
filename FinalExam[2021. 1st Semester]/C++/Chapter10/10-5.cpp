#include <iostream>
using namespace std;

template <class T>
T* concat(T a[], int sizea, T b[], int sizeb) {
	T* array = new T[sizea + sizeb];
	for (int i = 0; i < sizea + sizeb; i++) {
		if (i < sizea)
			array[i] = a[i];
		else
			array[i] = b[i - sizea];
	}
	return array;
}
  
int main() {
	int x[] = { 1, 10, 100, 5, 4 };
	int y[] = { 7, 6, 10, 9 };
	int* a = concat(x, 5, y, 4);

	for (int i = 0; i < 9; i++) {
		cout << a[i] << " ";
	}
}