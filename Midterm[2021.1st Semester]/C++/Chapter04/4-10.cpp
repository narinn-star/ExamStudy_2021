#include <iostream>
using namespace std;

class Person {
	string name;
public:
	Person() {

	}
	Person(string name) {
		this->name = name;
	}
	string getName() {
		return name;
	}
	void setName(string name) {
		this->name = name;
	}
};

class Family {
	Person* p;
	int size;
	string name;
public:
	Family(string name, int size) {
		this->size = size;
		p = new Person[size];
	}
	void show() {
		cout << "Simpson������ ������ ���� " << size << "�� �Դϴ�." << endl;
		for (int i = 0; i < size; i++) {
			cout << p[i].getName() << "\t";
		}
	}
	void setName(int n, string name) {
		p[n].setName(name);
 	}
	~Family() {

	}
};

int main() {
	Family* simpson = new Family("Simpson", 3);
	simpson->setName(0, "Mr. Simpson");
	simpson->setName(1, "Mrs. Simpson");
	simpson->setName(2, "Bart Simpson");
	simpson->show();
	delete simpson;
}