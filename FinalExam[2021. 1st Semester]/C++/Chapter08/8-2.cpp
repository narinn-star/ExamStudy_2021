#include <iostream>
using namespace std;

class Circle {
	int radius;
public:
	Circle(int radius = 0) {
		this->radius = radius;
	}
	int getRadius() {
		return radius;
	}
	void setRadius(int radius) {
		this->radius = radius;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
};

class NamedCircle : public Circle {
	string name;
public:
	NamedCircle() {

	}
	string getName() {
		return name;
	}
	void setName(string name) {
		this->name = name;
	}
};

int main() {
	NamedCircle pizza[5];
	int radius, big, index;
	string name;

	cout << "5 ���� ���� �������� ���� �̸��� �Է��ϼ���" << endl;
	for (int i = 0; i < 5; i++) {
		cout << i + 1 << " >> ";
		cin >> radius >> name;
		pizza[i].setRadius(radius);
		pizza[i].setName(name);
		big = pizza[0].getArea();
	}
	
	for (int i = 1; i < 5; i++) {
		if (big < pizza[i].getArea()) {
			big = pizza[i].getArea();
			index = i;
		}
	}

	cout << endl << "���� ������ ū ���ڴ� " << pizza[index].getName() << "�Դϴ�.";
}