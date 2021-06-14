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
		return this.color + "���� (" + getX() + "," + getY() + ")�� ��";
	}

	public static void main(String[] args) {
		ColorPoints zeroPoint = new ColorPoints();	//(0, 0) ��ġ�� BLACK �� ��
		System.out.println(zeroPoint.toString() + "�Դϴ�.");
		
		ColorPoints cp = new ColorPoints(10, 10); 	//(10, 10) ��ġ�� BLACK �� ��
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "�Դϴ�.");
	}
}