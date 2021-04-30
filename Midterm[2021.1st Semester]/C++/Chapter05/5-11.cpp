#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
using namespace std;

class Book {
	char* title;
	int price;
public:
	Book(const char* title, int price) {
		int len = strlen(title) + 1;
		this->title = new char[len];
		this->price = price;
		strcpy(this->title, title);
	}
	Book(const Book& b) {
		this->price = b.price;
		int len = strlen(b.title) + 1;
		this->title = new char[len];
		strcpy(this->title, b.title);
	}
	~Book() {
		delete[] title;
	}
	void set(const char* title, int price) {
		if (this->title) {
			delete[] this->title;
		}
		this->price = price;
		int len = strlen(title) + 1;
		this->title = new char[len];
		strcpy(this->title, title);
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

//�����Ϸ��� �����ϴ� ����Ʈ ���� ������ �ڵ�
//Book::Book(const Book& b){
//	this->title = b.title;
//	this->size = b.price;
//}