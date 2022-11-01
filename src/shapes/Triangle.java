package shapes;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	private double perimeter;
	private double area;
	
	//Methods
	public Triangle() {
		this.sideA=1;
		this.sideB=1;
		this.sideC=1;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}
	
	public Triangle(double a, double b, double c) {
		this.sideA=a;
		this.sideB=b;
		this.sideB=c;
		
	}
	
	private double findPerimeter() {
		return sideA+sideB+sideC;
	}
	
	private double findArea() {
		return sideA*sideB/2;
	}
	
	public void printStats() {
		System.out.println("Triangle");
		System.out.println("Side A (height) = "+this.sideA);
		System.out.println("Side B (base) = "+this.sideB);
		System.out.println("Side C = "+this.sideC);
		System.out.println("Perimeter = "+this.perimeter);
		System.out.println("Area = "+this.area);
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
		
		
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
		this.perimeter = findPerimeter();
		this.area= findArea();
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}
	
	
}
