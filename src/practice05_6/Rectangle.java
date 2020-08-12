package practice05_6;

public class Rectangle extends Shape implements Resizable {
	int width = 0;
	int height = 0;

	public Rectangle(int a, int b) {
		width = a;
		height = b;
	}

	@Override
	public void resize(double rate) {
		width *= rate;
		height *= rate;

	}

	@Override
	public double getArea() {
		double area = width*height;
		return area;
	}

	@Override
	public double getPerimeter() {
		double peri = (width+height)*2;
		return peri;
	}

}
