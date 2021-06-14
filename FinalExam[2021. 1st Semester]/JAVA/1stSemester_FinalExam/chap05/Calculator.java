package chap05;

import java.util.Scanner;

abstract class Calc {
	protected int a;
	protected int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract int calculate();
}

class Add extends Calc {
	public Add(int a, int b) {
		setValue(a, b);
	}
	public int calculate() {
		return a + b;
	}
}

class Sub extends Calc {
	public Sub(int a, int b) {
		setValue(a, b);
	}
	public int calculate() {
		return a - b;
	}
}

class Mul extends Calc {
	public Mul(int a, int b) {
		setValue(a, b);
	}
	public int calculate() {
		return a * b;
	}
}

class Div extends Calc {
	public Div(int a, int b) {
		setValue(a, b);
	}
	public int calculate() {
		if (b == 0)
			return 0;
		else
			return a / b;
	}
}

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		char op = scanner.next().charAt(0);
		int res = 0;
		switch (op) {
		case '+':
			Add a = new Add(n1, n2);
			res = a.calculate();
			break;
		case '-':
			Sub s = new Sub(n1, n2);
			res = s.calculate();
			break;
		case '*':
			Mul m = new Mul(n1, n2);
			res = m.calculate();
			break;
		case '/':
			Div d = new Div(n1, n2);
			res = d.calculate();
			break;
		default:
			System.out.println("잘못입력");
			break;
		}
		System.out.println(res);
		scanner.close();
	}

}