#include <iostream>
using namespace std;

class item {
	int iPrice;
	string iName;
public:
	item() { //키보드에서 item의 이름과 가격을 입력하여 멤버변수 초기화

	}
	void setPrice(int cprice) { // cprice로 가격 변경

	}
};

class Storage {
private:
	int nData; //확보할 공간 수
	item* itemStrg;
public:
	Storage(int nsize) { //nsize > 0

	}
	void showList() { //등록된 모든 item의 이름과 가격 출력

	}
	void changePrice(string s, int newprice) { //item 이름으로 검색하여 있으면 이름과 가격 출력, 없으면 '없음' 출력

	}
};

int main() {
	Storage items(5); //item 5개의 이름과 가격 : 컵 1500 집게 2000 연필 200 볼펜 500 줄자 2000
	items.showList(); //입력된 5개의 아이템들의 이름과 가격 출력

	string s;
	int newprice;

	cin >> s >> newprice; //가격 바꿀 아이템 이름과 바꿀 가격 입력
	items.changePrice(s, newprice);
	items.showList(); //가격 변경 확인
}