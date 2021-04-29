#include <iostream>
using namespace std;

class Add {
	int a, b;
public:
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		return a + b;
	}
};

class Sub {
	int a, b;
public:
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		return a - b;
	}
 };

class Mul {
	int a, b;
public:
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		return a * b;
	}
};

class Div {
	int a, b;
public:
	void setValue(int x, int y) {
		a = x;
		b = y;
	}
	int calculate() {
		if (b == 0) {
			return 0;
		}
		return a / b;
	}
};

int main() {
	Add a;
	Sub s;
	Mul m;
	Div d;
	int x, y;
	char op;
	while (1) {
		cout << "�� ������ �����ڸ� �Է��ϼ��� >> ";
		cin >> x >> y >> op;
		switch (op) {
		case '+':
			a.setValue(x, y);
			cout << a.calculate() << endl;
			break;
		case '-':
			s.setValue(x, y);
			cout << s.calculate() << endl;
			break;
		case '*':
			m.setValue(x, y);
			cout << m.calculate() << endl;
			break;
		case '/':
			d.setValue(x, y);
			cout << d.calculate() << endl;
			break;
		default: cout << "ERROR" << endl;
			break;
		}
	}
}