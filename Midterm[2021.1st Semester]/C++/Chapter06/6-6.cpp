#include <iostream>
using namespace std;

class ArrayUtility2 {
public:
	static int* concat(int s1[], int s2[], int size) {
		int* s3 = new int[size];
		for (int i = 0; i < size/2; i++) {
			s3[i] = s1[i];
		}
		for (int i = size / 2, j = 0; i < size; i++, j++) {
			s3[i] = s2[j];
		}
		return s3;
	}
	static int* remove(int s1[], int s2[], int size, int& retSize){

	}
};

int main() {
	int x[5], y[5];
	int* p;
	int size, retSize = 0;
	cout << "������ 5�� �Է��϶�. �迭 x�� �����Ѵ� >> ";
	for (int i = 0; i < 5; i++) {
		cin >> x[i];
	}
	cout << "������ 5�� �Է��϶�. �迭 y�� �����Ѵ� >> ";
	for (int i = 0; i < 5; i++) {
		cin >> y[i];
	}
	size = (sizeof(x) + sizeof(y) / sizeof(int));
	cout << "��ģ ���� �迭�� ����Ѵ�." << endl;
	p = ArrayUtility2::concat(x, y, size);
	for (int i = 0; i < size; i++) {
		cout << p[i] << " ";
	}
	cout << endl << "�迭 x[]���� y[]�� �� ����� ����Ѵ�. ������ ";
	p = ArrayUtility2::remove(x, y, size, retSize);
	cout << retSize << endl;
	for (int i = 0; i < retSize; i++) {
		cout << p[i] << " ";
	}
}