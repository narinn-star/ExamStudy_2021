#include <iostream>
using namespace std;

bool bigger(int a, int b, int& big) {
	if (a == b)
		return true;
	else {
		if (a > b)
			big = a;
		else
			big = b;
		return false;
	}
}

int main() {
	int a, b, big;
	cout << "���� �� �� �Է� >> ";
	cin >> a >> b;
	if (bigger(a, b, big)) {
		cout << "a == b";
	}
	else
		cout << "big = " << big;
}