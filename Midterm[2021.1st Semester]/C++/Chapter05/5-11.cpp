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
		cout << title << " " << price << "원" << endl;
	}
};

int main() {
	Book cpp("명품C++", 10000);
	Book java = cpp; //복사 생성자 호출
	java.set("명품자바", 12000);
	cpp.show();
	java.show();
}

//컴파일러가 삽입하는 디폴트 복사 생성자 코드
//Book::Book(const Book& b){
//	this->title = b.title;
//	this->size = b.price;
//}