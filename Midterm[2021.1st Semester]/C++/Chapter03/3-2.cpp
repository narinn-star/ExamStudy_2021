#include <iostream>
#include <string>
using namespace std;

class Date {
	int year;
	int month;
	int day;
public:
	Date() {
		year = 0;
		month = 0;
		day = 0;
	}
	Date(int year, int month, int day) {
		this->year = year;
		this->month = month;
		this->day = day;
	}
	Date(string day) {
		year = stoi(day.substr(0, 4));
		month = stoi(day.substr(5, 1));
		this->day = stoi(day.substr(7, 2));
	}
	void show() {
		cout << year << "³â " << month << "¿ù " << day << "ÀÏ" << endl;
	}
	int getYear() {
		return year;
	}
	int getMonth() {
		return month;
	}
	int getDay() {
		return day;
	}
};

int main() {
	Date birth(2014, 3, 20);
	Date independenceDay("1945/8/15");
	independenceDay.show();
	cout << birth.getYear() << ", " << birth.getMonth() << ", " << birth.getDay() << endl;
}