#include <iostream>
#include <string>
using namespace std;

int main() {
	cout << "문자열 입력 >> ";
	string s;
	int count = 0;
	getline(cin, s);
	for (int i = 0; i < s.length(); i++) {
		if (s[i] == 'a')
			count++;
	}
	cout << "문자 a는 " << count << "개 있습니다." << endl;
}