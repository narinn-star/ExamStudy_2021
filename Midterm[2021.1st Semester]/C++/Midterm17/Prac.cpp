#include <iostream>
using namespace std;

class Circle {
	int radius;
	string name;
public:
	void setCircle(string name, int radius) {
		this->name = name;
		this->radius = radius;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
	string getName() {
		return name;
	}
};

class CircleManager {
	Circle* p;
	string name;
	int radius;
	int size;
public:
	CircleManager(int size) {
		p = new Circle[size];
		this->size = size;
		for (int i = 0; i < size; i++) {
			cout << "�� " << i + 1 << "�� �̸��� ������ >> ";
			cin >> name >> radius;
			p[i].setCircle(name, radius);
		}
	}
	~CircleManager() {
		delete[]p;
	}
	void searchByName() {
		cout << "�˻��ϰ��� �ϴ� ���� �̸� >> ";
		cin >> name;
		for (int i = 0; i < size; i++) {
			if (p[i].getName() == name) {
				cout << name << "�� ������ " << p[i].getArea() << endl;
			}
		}
	}
	void searchByArea() {
		int area;
		cout << "�ּ� ������ ������ �Է��ϼ��� >> ";
		cin >> area;
		cout << area << "���� ū ���� �˻��մϴ�." << endl;
		for (int i = 0; i < size; i++) {
			if (p[i].getArea() > area) {
				cout << p[i].getName() << "�� ������ " << p[i].getArea() << ", ";
			}
		}
	}
};

int main() {
	int num;
	cout << "���� ���� >> ";
	cin >> num;

	CircleManager circles(num);
	circles.searchByName();
	circles.searchByArea();
}