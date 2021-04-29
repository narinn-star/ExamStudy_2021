#include <iostream>
using namespace std;

class Account {
	int id;
	int balance;
	string name;
public:
	Account() {
		id = 1;
		balance = 0;
		name = "name";
	}
	Account(string name, int id, int balance) {
		this->name = name;
		this->id = id;
		this->balance = balance;
	}
	string getOwner() {
		return name;
	}
	int deposit(int money) {
		balance += money;
		return balance;
	}
	int withdraw(int money) {
		balance -= money;
		return balance;
	}
	int inquiry() {
		return balance;
	}
};

int main() {
	Account a("kitae", 1, 5000);
	a.deposit(50000);
	cout << a.getOwner() << "ÀÇ ÀÜ¾×Àº " << a.inquiry() << endl;
	int money = a.withdraw(20000);
	cout << a.getOwner() << "ÀÇ ÀÜ¾×Àº " << a.inquiry() << endl;
}