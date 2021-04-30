#include <iostream>
using namespace std;

class MyVector {
	int* mem;
	int size;
public:
	MyVector(int n = 100, int val = 0) {
		mem = new int[n];
		size = n;
		for (int i = 0; i < size; i++)
			mem[i] = val;
	}
	~MyVector() {
		delete[]mem;
	}
	void show() {
		cout << "size = " << size << endl;
		for (int i = 0; i < size; i++) {
			cout << mem[i] << " ";
		}
		cout << endl;
	}
};

int main() {
	MyVector v1;
	MyVector v2(10, 10);
	v1.show();
	v2.show();
}