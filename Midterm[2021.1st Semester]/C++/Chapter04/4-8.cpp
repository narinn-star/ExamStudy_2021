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
	cout << "원의 개수 >> ";
	int num;
	cin >> num;
	Circle *circle = new Circle[num];
	int radius, count = 0;
	for (int i = 0; i < num; i++) {
		cout << "원 " << i + 1 << "의 반지름 >> ";
		cin >> radius;
		(circle+i)->setRadius(radius);
	}
	for (int i = 0; i < num; i++) {
		if ((circle + i)->getArea() > 100)
			count++;
	}
	cout << "면적이 100보다 큰 원은 " << count << "개 입니다." << endl;

	delete[] circle;
}