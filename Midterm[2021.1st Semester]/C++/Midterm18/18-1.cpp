#include <iostream>
using namespace std;

class Book {
	string str;
	int price;
	char* publishedDate; // 출판일 09022018 2018년 9월 2일
public:
	Book() {

	}
	Book(const char* title, int price, const char* pDate) {

	}
	void set(const char* title, int price, const char* pDate) {
		
	}
	void show() {

	}
};

int replaceBookTitle(Book* books, int nbks, const char* oldtitle, const char* newtitle) { //교체할 이름을 가진 책을 찾으면 이름을 교체하고, 인덱스반환, 없으면 -1 반환

}

int main() {
	Book bookShelf[3] = {
		Book("C#프로그래밍", 20000, "09012016"),
		Book("C++", 25000, "09022018"),
		Book()
	};

	bookShelf[2].set("Java programming", 28000, "12052017");

	bookShelf[0].show();
	bookShelf[1].show();

	if (int n = (replaceBookTitle(bookShelf, 3, "c++", "C++")) < 0) {
		cout << "책 이름이 없습니다. " << endl;
	}
	else {
		bookShelf[n].show();
	}
}