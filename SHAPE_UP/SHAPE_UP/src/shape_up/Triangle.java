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
}
