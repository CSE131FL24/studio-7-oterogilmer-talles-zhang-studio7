package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle() {
		
	}
	public Rectangle(double initLength, double initWidth) {
		length = initLength;
		width = initWidth;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter(){
		return length*2+width*2;
	}
	
	public boolean compareSmaller(Rectangle one, Rectangle two)
	{
		if(one.area()<two.area()) {
			return true;
		}
		return false;
	}
	
	public boolean isSquare()
	{
		if(length == width) {
			return true;
		}
		return false;
	}
	
	public void draw() {
		StdDraw.rectangle(0.5,0.5,width/2,length/2);
		StdDraw.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle original = new Rectangle(0.3,0.3);
		Rectangle second = new Rectangle(0.7,0.5);
		System.out.println(original.area());
		System.out.println(original.perimeter());
		System.out.println(original.isSquare());
		original.draw();
		System.out.println(original.compareSmaller(second,original)); s
	}

}
