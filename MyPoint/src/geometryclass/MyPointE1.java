package geometryclass;

public class MyPointE1 {
	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint(0,0); //declares variable point 1
		
		double p2XRAND = (double)(Math.random()*100); // generates random double for x of point 2
		double p2YRAND = (double)(Math.random()*100); // generates random double for y of point 2
		
		MyPoint p2 = new MyPoint(p2XRAND, p2YRAND); //declares variable point 2
		
		p1.distance(p2); // calls distance method
		
		System.out.println("Point 1: (0,0)");
		System.out.format("Point 2: (" + "%.4f" + "," + "%.4f" + ")" , p2XRAND, p2YRAND); //formats random doubles to 4 decimal places
		System.out.println();
		System.out.println();
		System.out.format("Distance = " + "%.4f", MyPoint.distance(p1, p2)); //formats distance

	}
}

// MyPoint class representing x and y coordinates
class MyPoint { 
	private double x;
	private double y;
	
	// constructs points with specified coordinates 
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
		//passes variable values
	}
	
//	method named distance that returns the distance from specified MyPoint type
	public double distance(MyPoint newPoint) {
		return distance(this, newPoint);
	}
	
	
	//STATIC method named distance that returns the distance between 2 points
	public static double distance (MyPoint p1, MyPoint p2) {
		double distance = Math.sqrt(Math.pow(( p1.x - p2.x ), 2) + Math.pow(p1.y - p2.y, 2));
		//formula to calculate distance
		
		return distance; // returns distance value		
	}
	
	public double getX() {
		return x; 
	}
	public double getY() {
		return y;
	}
	// getter methods for x and y values
}

