#include <iostream>
using namespace std;

class Storage {
private:
	int nData; //�ڷ��� ��
	int strg[20]; // �ڷ� ���� ����
public:
	Storage(int size) {
		nData = size;
		cout << "�ڷ� " << nData << "�� �Է� : ";
		for (int i = 0; i < nData; i++) {
			cin >> strg[i];
		}
	}
	void showList() { //�ڷ��� �� : �ڷ� ���
		cout << nData << " : ";
		for (int i = 0; i < nData; i++) {
			cout << strg[i] << " ";
		}
		cout << endl;
	}
	int multipleN(int n) {
		int count = 0;
		for (int i = 0; i < nData; i++) {
			if (strg[i] % 10 != 0) {
				if ((strg[i] % 10) % n == 0)
					count++;
			}
		}
		cout << n << "�� ����� " << count << "�� �Դϴ�." << endl;

		return count;
	}
	void add_Strg(Storage s) {
		int size = nData + s.nData;
		cout << s.nData << " " << size << endl;
		int j = 0;
		if (size > 20) {
			cout << "���� ���� �Ұ���" << endl;
		}
		else {
			for (int i = nData; i < size; i++) {
				strg[i] = s.strg[j];
				j++;
			}
		}
		nData = size; // �׷��� 14�� ��¡ ~!
	}
};

void main() {
	Storage s1(4); //4���� �ڷ� �Է�
	s1.showList(); //4: 10 3 3 4

	Storage s2(10); //10���� �ڷ� �Է�
	s2.showList(); //10: 1 12 33 24 5 16 7 28 3 27

	s1.multipleN(3); //3�� ����� 2���Դϴ�.

	s1.add_Strg(s2); 
	s1.showList(); //14:10 3 3 4 1 12 33 24 5 16 7 28 3 27 
}