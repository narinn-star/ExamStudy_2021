#include <iostream>
using namespace std;

class item {
	int iPrice;
	string iName;
public:
	item() { //Ű���忡�� item�� �̸��� ������ �Է��Ͽ� ������� �ʱ�ȭ

	}
	void setPrice(int cprice) { // cprice�� ���� ����

	}
};

class Storage {
private:
	int nData; //Ȯ���� ���� ��
	item* itemStrg;
public:
	Storage(int nsize) { //nsize > 0

	}
	void showList() { //��ϵ� ��� item�� �̸��� ���� ���

	}
	void changePrice(string s, int newprice) { //item �̸����� �˻��Ͽ� ������ �̸��� ���� ���, ������ '����' ���

	}
};

int main() {
	Storage items(5); //item 5���� �̸��� ���� : �� 1500 ���� 2000 ���� 200 ���� 500 ���� 2000
	items.showList(); //�Էµ� 5���� �����۵��� �̸��� ���� ���

	string s;
	int newprice;

	cin >> s >> newprice; //���� �ٲ� ������ �̸��� �ٲ� ���� �Է�
	items.changePrice(s, newprice);
	items.showList(); //���� ���� Ȯ��
}