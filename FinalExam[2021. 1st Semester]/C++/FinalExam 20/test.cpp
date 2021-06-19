#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <cstring>

using namespace std;

class MyString {
private:
	int m_nLen;
	char* m_pStr;
public:
	MyString();
	MyString(const char* str);
	MyString(const MyString& ref);
	~MyString();
	friend ostream& operator <<(ostream& os, MyString& temp);
	MyString operator+(MyString op2);
	MyString& operator = (const MyString& ref);
	MyString& operator-(MyString& ref);
};

MyString::MyString() {
	m_nLen = 1;
	m_pStr = new char[m_nLen];
	strcpy(m_pStr, "");
}

MyString::MyString(const char* str) {
	m_nLen = strlen(str);
	m_pStr = new char[m_nLen + 1];
	strcpy(m_pStr, str);
}

MyString::MyString(const MyString& ref) {
	m_nLen = ref.m_nLen;
	m_pStr = new char[ref.m_nLen + 1];
	for (int i = 0; i < ref.m_nLen; i++)
		m_pStr[i] = ref.m_pStr[i];
}

MyString::~MyString() {
	delete[]m_pStr;
	m_nLen = 0;
	m_pStr = NULL;
}

ostream& operator <<(ostream& os, MyString& temp) {
	for (int i = 0; i < temp.m_nLen; i++) {
		os << temp.m_pStr[i];
	}
	return os;
}

MyString MyString::operator+(MyString op2) {
	int k = 0;
	MyString tmp;
	tmp.m_nLen = m_nLen + op2.m_nLen;
	tmp.m_pStr = new char[tmp.m_nLen];
	for (int i = 0; i < this->m_nLen; i++) {
		if (k < m_nLen) {
			tmp.m_pStr[k] = this->m_pStr[i];
			k++;
		}
	}

	for (int i = 0; i < op2.m_nLen; i++) {
		if (k < m_nLen + op2.m_nLen) {
			tmp.m_pStr[k] = op2.m_pStr[i];
			k++;
		}
	}
	return tmp;
}

MyString& MyString::operator-(MyString& ref) {
	MyString temp;
	delete[]temp.m_pStr;
	temp.m_nLen = m_nLen;
	temp.m_pStr = new char[m_nLen + 1];
	strcpy(temp.m_pStr, m_pStr);
	delete[]m_pStr;
	int len = 0, cnt = 0, idx = 0;
	char ch[10];

	for (int i = 0; i < temp.m_nLen; i++) { //두 클래스 중복값 배열에 저장
		for (int j = 0; j < ref.m_nLen; j++) {
			if (temp.m_pStr[i] == ref.m_pStr[j]) {
				ch[len] = temp.m_pStr[i];
				len++;
			}
		}
	}

	for (int i = 0; i < temp.m_nLen; i++) { //첫클래스 중복값에 0 삽입
		for (int j = 0; j < len; j++) {
			if (temp.m_pStr[i] == ch[j]) {
				temp.m_pStr[i] = 0;
				cnt++; //삭제한 갯수
			}
		}
	}

	for (int i = 0; i < ref.m_nLen; i++) { //두번째 클래스 중복값에 0 삽입
		for (int j = 0; j < len; j++) {
			if (ref.m_pStr[i] == ch[j]) {
				ref.m_pStr[i] = 0;
				cnt++; //삭제한 갯수
			}
		}
	}
	m_nLen = temp.m_nLen + ref.m_nLen - cnt; //중복된값 빼줌
	m_pStr = new char[m_nLen + 1];

	for (int i = 0; i < temp.m_nLen; i++) {
		if (temp.m_pStr[i] == 0) //삭제된 값이면 다시돌림
			continue;
		m_pStr[idx] = temp.m_pStr[i];//아니면 삽입
		idx++;
	}

	for (int i = 0; i < ref.m_nLen; i++) {
		if (ref.m_pStr[i] == 0) //삭제된 값이면 다시돌림
			continue;
		m_pStr[idx] = ref.m_pStr[i];//아니면 삽입
		idx++;
	}
	return *this;
}

MyString& MyString::operator=(const MyString& ref) {
	delete[] m_pStr;
	m_nLen = ref.m_nLen;
	m_pStr = new char[ref.m_nLen + 1];
	for (int i = 0; i < ref.m_nLen; i++)
		m_pStr[i] = ref.m_pStr[i];
	return *this;
}

int main() {
	MyString strA("Banana");
	MyString strB("Orange");
	MyString strC;
	MyString strD;
	MyString strE;

	cout << "strA=> " << strA << endl;
	cout << "strB=> " << strB << endl;

	strE = strA;

	strC = strA + strB;
	cout << "strC = " << strC << endl;

	strD = strA - strB;
	cout << "strD = " << strD << endl;
}
