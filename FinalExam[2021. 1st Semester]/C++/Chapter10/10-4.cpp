#include <iostream>
using namespace std;

template <class T>
T search(T n, T x[], int length) {
	for (int i = 0; i < length; i++) {
		if (x[i] == n)
			return true;
	}
	return false;
}

int main() {
	int x[] = { 1, 10, 100, 5, 4 };
	if (search(100, x, 5)) cout << "100�� �迭 x�� ���ԵǾ� �ִ�.";
	else cout << "100�� �迭 x�� ���ԵǾ� ���� �ʴ�.";
}