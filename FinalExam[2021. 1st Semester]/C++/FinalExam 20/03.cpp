#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
using namespace std;

class MyString {
private:
	int m_nLen;
	char* m_pStr;
public:
	MyString() {
		m_nLen = 1;
		m_pStr = new char[m_nLen];
		strcpy(m_pStr, "");
	}
	MyString(const char* str) {
		m_nLen = strlen(str) + 1;
		m_pStr = new char[m_nLen];
		strcpy(m_pStr, str);
	}
	MyString(const MyString& ob);
	~MyString() {
		if (m_pStr)
			delete[] m_pStr;
	}
	friend ostream& operator << (ostream& os, MyString& temp);
	MyString operator+ (MyString ob1);
};

ostream& operator << (ostream& os, MyString& temp) {
	cout << temp.m_pStr;
	return os;
}

//���� ������
MyString::MyString(const MyString& ob) {
	m_nLen = strlen(ob.m_pStr);
	m_pStr = new char[ob.m_nLen + 1];
	for (int i = 0; i < strlen(m_pStr); i++) {
		m_pStr[i] = ob.m_pStr[i];
	}
}

MyString MyString::operator+(MyString ob1) {
	int cnt = 0;
	MyString temp;
	temp.m_nLen = m_nLen + ob1.m_nLen;
	temp.m_pStr = new char[temp.m_nLen];
	
	for (int i = 0; i < strlen(m_pStr); i++) {
		temp.m_pStr[cnt] = m_pStr[i];
		cnt++;
	}
	for (int i = 0; i < strlen(ob1.m_pStr); i++) {
		temp.m_pStr[cnt] = ob1.m_pStr[i];
		cnt++;
	}
	temp.m_pStr[cnt] = '\0';

	return temp;
}



void main() {
	MyString strA("Banana");
	MyString strB("Orange");
	MyString strC;
	//MyString strD;

	cout << "strA=> " << strA << endl;
	cout << "strB=> " << strB << endl;
	//��� ��� Banana
	//			Orange

	// + �������� �����ε�
	strC = strA + strB;
	cout << "strC = " << strC << endl;
	//��� ��� strC = BananaOrange

	// - ������ �����ε�
	//strD = strA - strB;
	//cout << "strD = " << strD << endl;
	//��� ��� strD = BOrge (a ��� ����, n�� ��� ����)
	//strA = Apple, strB = Orange�̸�
	//strD = pplOrng (A�� e ����)
}