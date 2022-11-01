package shapes;

public class Circle {

	private double radius;
	private double circumference;
	private double area;
	
	//Methods
	public Circle() {
		
		this.radius = 1;
		this.circumference = findCircumference();
		this.area = findArea();
		
	}
	
	public Circle(double r) {
		this.radius=r;
	}
	
	private double findCircumference() {
		return this.radius*2*Math.PI;
	}
	
	private double findArea() {
		double a = Math.PI *Math.pow(radius, 2);
		return a;
	}
	
	public void printStats() {
		System.out.println("Circle");
		System.out.println("Radius = "+this.radius);
		System.out.println("Circumference = "+this.circumference);
		System.out.println("Area = "+ this.area);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		this.circumference = findCircumference();
		this.area = findArea();
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}
	
	
}
