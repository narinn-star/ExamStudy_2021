#include <iostream>
using namespace std;

class Circle {
	int radius;
public:
	Circle() {
		radius = 1;
	}
	Circle(int radius) {
		this->radius = radius;
	}
	void setRadius(int radius) {
		this->radius = radius;
	}
	int getRadius() {
		return radius;
	}
};

void swap(Circle &a, Circle &b) {
	int tmp;
	tmp = a.getRadius();
	a.setRadius(b.getRadius());
	b.setRadius(tmp);
}

int main() {
	Circle c1(5), c2(10);
	cout << c1.getRadius() << " " << c2.getRadius() << endl;

	swap(c1, c2);
	cout << c1.getRadius() << " " << c2.getRadius() << endl;
}