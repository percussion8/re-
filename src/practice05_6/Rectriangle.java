package practice05_6;

public class Rectriangle extends Shape{
	int width, height;
	
	Rectriangle(int a, int b){
		width = a;
		height = b;
	}
	@Override
	public double getArea() {
		double area = width*height/2;
		return area;
	}

	@Override
	public double getPerimeter() {
		double peri = width+height+Math.sqrt(width*width + height*height);
		return peri;
	}
	
	

}
