package chap05;

public class ColorPoints extends Point{
	private String color;
	public ColorPoints() {
		super(0,0);
		this.color = "BLACK";
	}
	public ColorPoints(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return this.color + "색의 (" + getX() + "," + getY() + ")의 점";
	}

	public static void main(String[] args) {
		ColorPoints zeroPoint = new ColorPoints();	//(0, 0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPoints cp = new ColorPoints(10, 10); 	//(10, 10) 위치의 BLACK 색 점
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}