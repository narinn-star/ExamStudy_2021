#include <iostream>
#include <string>
using namespace std;

class Book {
	string title;
	int price;
public:
	Book(string title, int price) {
		this->title = title;
		this->price = price;
	}
	void set(string title, int price) {
		this->title = title;
		this->price = price;
	}
	void show() {
		cout << title << " " << price << "��" << endl;
	}
};

int main() {
	Book cpp("��ǰC++", 10000);
	Book java = cpp; //���� ������ ȣ��
	java.set("��ǰ�ڹ�", 12000);
	cpp.show();
	java.show();
}