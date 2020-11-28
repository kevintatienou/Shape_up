package shape_up;

public class Triangle extends Forme{
	private int c1;
	private int c2;
	private int c3;
	
	public Triangle(int x, int y, int c1, int c2, int c3) {
		super(x, y);
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
	}

	public int getC1() {
		return c1;
	}

	public void setC1(int c1) {
		this.c1 = c1;
	}
	
	public int getC2() {
		return c2;
	}
	
	public void setC2(int c2) {
		this.c2 = c2;
	}

	public int getC3() {
		return c3;
	}

	public void setC3(int c3) {
		this.c3 = c3;
	}	
}
