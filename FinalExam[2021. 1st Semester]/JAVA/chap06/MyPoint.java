package chap06;

public class MyPoint {
	private int a;
	private int b;
	public MyPoint(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return "Point(" + this.a + ", " + this.b + ")";
	}
	public boolean equals(Object obj) {
		MyPoint point = (MyPoint)obj;
		if(a == point.a && b == point.b)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		MyPoint p = new MyPoint(3, 50);
		MyPoint q = new MyPoint(4, 50);
		System.out.println(p);
		if(p.equals(q))
			System.out.println("같은 점");
		else
			System.out.println("다른 점");
	}
}