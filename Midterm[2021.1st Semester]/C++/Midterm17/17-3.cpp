#include <iostream>
using namespace std;

class Storage {
private:
	int nData;
	int* strg;
public:
	Storage() {

	}
	Storage(int size) {
		nData = size;
		strg = new int[nData];
		cout << "�ڷ� " << nData << "�� �Է� : ";
		for (int i = 0; i < nData; i++) {
			cin >> strg[i];
			for (int j = 0; j < i; j++) {
				if (strg[i] == strg[j]) {
					i--;
					cout << "<�ߺ�>";
					break;
				}
			}
		}
	}
	void showList() {
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
	void add_Strg(Storage s2) {
		int size = nData + s2.nData;
		for (int i = nData; i < size; i++) {
			
		}
		nData = size;
	}
};

void main() {
	Storage s1(4); //�ڷ� 4�� �Է�
	s1.showList();

	Storage s2(10); //�ڷ� 10�� �Է�
	s2.showList();

	s1.add_Strg(s2);
	s1.showList();
}