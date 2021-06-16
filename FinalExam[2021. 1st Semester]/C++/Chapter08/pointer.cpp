#include <iostream>
using namespace std;

int main() {
	int a = 5;
	int b = a;
	int* p = &a;
	a = 10;
	cout << *p;
	cout << b;
	cout << a;
}