#include <iostream>
using namespace std;

class Board {
	string sent;
public:
	Board() {}
	static void add(string sent) {
		
	}
	static void print() {
		cout << "======= �Խ��� =======" << endl;

	}
};

int main() {
	Board::add("�߰����� ���� ���� ���� �����Դϴ�.");
	Board::add("�ڵ� ����� ���� �̿��� �ּ���.");
	Board::print();
	Board::add("���Ҹ� �л��� ������ȸ �Ի��Ͽ����ϴ�. �������ּ���.");
	Board::print();
}