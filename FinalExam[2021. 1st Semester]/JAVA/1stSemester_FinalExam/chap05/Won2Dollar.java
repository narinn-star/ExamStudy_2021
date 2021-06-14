package chap05;

import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString() + "�� " + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ��� >> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("��ȯ ��� : " + res + getDestString() + "�Դϴ�.");
		scanner.close();
	}
}

public class Won2Dollar extends Converter{
	public Won2Dollar(double won) {
		super.ratio = won;
	}
	protected double convert(double src) {
		return src / super.ratio;
	}
	protected String getSrcString() {
		return "��";
	}
	protected String getDestString() {
		return "�޷�";
	}
	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200);
		toDollar.run();
	}
}