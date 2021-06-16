#include <iostream>
using namespace std;

class Point {
	int x, y;
public:
	void set(int x, int y) {
		this->x = x;
		this->y = y;
	}
	void showPoint() {
		cout << "(" << x << ", " << y << ")" << endl;
	}
};

class ColorPoint :public Point {
	string color;
public:
	void setColor(string color) {
		this->color = color;
	}
	void showColorPoint() {
		cout << color << " : ";
		showPoint();
	}
};

int main() {
	ColorPoint cp;
	ColorPoint* pDer;
	Point* pBase = &cp; //��ĳ����

	pBase->set(3, 4);
	pBase->showPoint();

	pDer = (ColorPoint*)pBase; //�ٿ�ĳ����
	pDer->setColor("RED");
	pDer->showColorPoint();

	//ColorPoint* pDer;
	//Point* pBase, po;
	//pBase = &po;
	//pDer = (ColorPoint*)pBase; //�ٿ�ĳ����

	//pDer->set(3, 4);
	//pDer->setColor("RED");
}