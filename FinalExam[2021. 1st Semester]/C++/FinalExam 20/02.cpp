#include <iostream>
using namespace std;

class Converter {
protected:
	double ratio;
public:
	Converter(double ratio) { this->ratio = ratio; }
	virtual double convert(double src) = 0;
	virtual string getSrcString() = 0;
	virtual string getDestString() = 0;
};

class WonToDollar : public Converter {
public:
	WonToDollar(double ratio) :Converter(ratio) {

	}
	double convert(double src) {
		double res = src / ratio;
		cout << getSrcString() << "�� " << getDestString() << "���� �ٲߴϴ�. �Էµ� " << getSrcString() << "�� " << src << getSrcString() << "�Դϴ�." << endl;
		cout << "��ȯ ��� : " << res << getDestString() << endl;
		return res;
	}
	string getSrcString() {
		return "��";
	}
	string getDestString() {
		return "�޷�";
	}
};

int main() {
	double src;
	WonToDollar wd(1130);
	Converter* cv;
	cv = &wd;	//��ĳ����
	cv->convert(10000);
}