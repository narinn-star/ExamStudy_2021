#include <iostream>
using namespace std;

class Circle {
	int radius;
public:
	Circle() {
		radius = 1;
	}
	void setRadius(int radius) {
		this->radius = radius;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
};

int main() {
	cout << "���� ���� >> ";
	int num;
	cin >> num;
	Circle *circle = new Circle[num];
	int radius, count = 0;
	for (int i = 0; i < num; i++) {
		cout << "�� " << i + 1 << "�� ������ >> ";
		cin >> radius;
		(circle+i)->setRadius(radius);
	}
	for (int i = 0; i < num; i++) {
		if ((circle + i)->getArea() > 100)
			count++;
	}
	cout << "������ 100���� ū ���� " << count << "�� �Դϴ�." << endl;

	delete[] circle;
}