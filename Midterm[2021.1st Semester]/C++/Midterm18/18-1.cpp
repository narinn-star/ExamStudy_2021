#include <iostream>
using namespace std;

class Book {
	string str;
	int price;
	char* publishedDate; // ������ 09022018 2018�� 9�� 2��
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

int replaceBookTitle(Book* books, int nbks, const char* oldtitle, const char* newtitle) { //��ü�� �̸��� ���� å�� ã���� �̸��� ��ü�ϰ�, �ε�����ȯ, ������ -1 ��ȯ

}

int main() {
	Book bookShelf[3] = {
		Book("C#���α׷���", 20000, "09012016"),
		Book("C++", 25000, "09022018"),
		Book()
	};

	bookShelf[2].set("Java programming", 28000, "12052017");

	bookShelf[0].show();
	bookShelf[1].show();

	if (int n = (replaceBookTitle(bookShelf, 3, "c++", "C++")) < 0) {
		cout << "å �̸��� �����ϴ�. " << endl;
	}
	else {
		bookShelf[n].show();
	}
}