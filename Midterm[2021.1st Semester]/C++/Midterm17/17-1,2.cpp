#include <iostream>
using namespace std;

class Storage {
private:
	int nData; //자료의 수
	int strg[20]; // 자료 저장 공간
public:
	Storage(int size) {
		nData = size;
		cout << "자료 " << nData << "개 입력 : ";
		for (int i = 0; i < nData; i++) {
			cin >> strg[i];
		}
	}
	void showList() { //자료의 수 : 자료 목록
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
	void add_Strg(Storage s) {
		int size = nData + s.nData;
		cout << s.nData << " " << size << endl;
		int j = 0;
		if (size > 20) {
			cout << "덧셈 수행 불가능" << endl;
		}
		else {
			for (int i = nData; i < size; i++) {
				strg[i] = s.strg[j];
				j++;
			}
		}
		nData = size; // 그래야 14가 들어가징 ~!
	}
};

void main() {
	Storage s1(4); //4개의 자료 입력
	s1.showList(); //4: 10 3 3 4

	Storage s2(10); //10개의 자료 입력
	s2.showList(); //10: 1 12 33 24 5 16 7 28 3 27

	s1.multipleN(3); //3의 배수는 2개입니다.

	s1.add_Strg(s2); 
	s1.showList(); //14:10 3 3 4 1 12 33 24 5 16 7 28 3 27 
}