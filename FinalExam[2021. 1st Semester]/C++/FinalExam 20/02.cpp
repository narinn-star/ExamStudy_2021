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
		cout << getSrcString() << "을 " << getDestString() << "으로 바꿉니다. 입력된 " << getSrcString() << "은 " << src << getSrcString() << "입니다." << endl;
		cout << "변환 결과 : " << res << getDestString() << endl;
		return res;
	}
	string getSrcString() {
		return "원";
	}
	string getDestString() {
		return "달러";
	}
};

int main() {
	double src;
	WonToDollar wd(1130);
	Converter* cv;
	cv = &wd;	//업캐스팅
	cv->convert(10000);
}