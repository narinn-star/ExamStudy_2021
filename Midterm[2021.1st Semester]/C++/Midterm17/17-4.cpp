#include <iostream>
using namespace std;

class item {
	int iPrice;
	string iName;
public:
	item() { //Ű���忡�� item�� �̸��� ������ �Է��Ͽ� ������� �ʱ�ȭ
		cout << "item�� �̸��� ���� �Է� >> ";
		cin >> iName >> iPrice;
	}
	void setPrice(int cprice, string cname) { // cprice�� ���� ����
		iPrice = cprice;
		iName = cname;
	}
	string getName() {
		return iName;
	}
	int getPrice() {
		return iPrice;
	}
};

class Storage {
private:
	int nData; //Ȯ���� ���� ��
	item* itemStrg;
	int iPrice;
	string iName;
public:
	Storage(int nsize) { //nsize > 0
		int nData = nsize;
		itemStrg = new item[nData];
	}
	~Storage() {
		delete[]itemStrg;
	}
	void showList() { //��ϵ� ��� item�� �̸��� ���� ���
		for (int i = 0; i < nData; i++) {
			cout << itemStrg[i].getName() << " " << itemStrg[i].getPrice() << endl;
		}
	}
	void changePrice(string s, int newprice) { //item �̸����� �˻��Ͽ� ������ �̸��� ���� ���, ������ '����' ���
		for (int i = 0; i < nData; i++) {

		}
	}
};

int main() {
	Storage items(5); //item 5���� �̸��� ���� : �� 1500 ���� 2000 ���� 200 ���� 500 ���� 2000
	items.showList(); //�Էµ� 5���� �����۵��� �̸��� ���� ���

	string s;
	int newprice;

	//cin >> s >> newprice; //���� �ٲ� ������ �̸��� �ٲ� ���� �Է�
	//items.changePrice(s, newprice);
	//items.showList(); //���� ���� Ȯ��
}