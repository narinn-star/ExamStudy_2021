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
		cout << "자료 " << nData << "개 입력 : ";
		for (int i = 0; i < nData; i++) {
			cin >> strg[i];
			for (int j = 0; j < i; j++) {
				if (strg[i] == strg[j]) {
					i--;
					cout << "<중복>";
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
		cout << n << "의 배수는 " << count << "개 입니다." << endl;

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
	Storage s1(4); //자료 4개 입력
	s1.showList();

	Storage s2(10); //자료 10개 입력
	s2.showList();

	s1.add_Strg(s2);
	s1.showList();
}