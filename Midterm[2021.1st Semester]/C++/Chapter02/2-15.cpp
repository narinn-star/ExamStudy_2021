#include <iostream>
using namespace std;

int main() {
	char s[20];
	char op;
	int a, b, result;
	while (1) {
		cout << "? ";
		for (int i = 0; i < 3; i++) {
			cin.getline(s, 20, ' ');
			switch (i) {
			case 0:
				a = atoi(s);
				break;
			case 1:
				op = s[0];
				break;
			case 2:
				b = atoi(s);
				break;
			default:
				break;
			}
		}
		switch (op) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		case '%':
			result = a % b;
			break;
		default:
			break;
		}
		cout << a << " " << op << " " << b << " = " << result << endl;
	}
}