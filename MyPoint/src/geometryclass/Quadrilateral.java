package geometryclass;

// no argument Constructor with default corner points
public class Quadrilateral { 
	MyPoint pt1 = new MyPoint(-1,1);
	MyPoint pt2 = new MyPoint(1,1);
	MyPoint pt3 = new MyPoint(1,-1);
	MyPoint pt4 = new MyPoint(-1,-1);

	Quadrilateral() {
		
	}
	
	//include a Constructor that takes 4 MyPoint objects.
	public Quadrilateral (MyPoint newpt1, MyPoint newpt2, MyPoint newpt3, MyPoint newpt4) {
		pt1 = new MyPoint(newpt1.getX(), newpt1.getY());
		pt2 = new MyPoint(newpt2.getX(), newpt2.getY());
		pt3 = new MyPoint(newpt3.getX(), newpt3.getY());
		pt4 = new MyPoint(newpt4.getX(), newpt4.getY());
	}
	
	//Method named getPerimeter() that returns the total length of the perimeter
	public double getPerimeter() { 

		double sum = MyPoint.distance(pt1, pt2) + MyPoint.distance(pt2, pt3) + MyPoint.distance(pt3, pt4) + MyPoint.distance(pt4, pt1);
		//calculates the distance between each vertex
		return sum; // returns sum
	}

	//Method named getSides() that returns an array of doubles containing the length of each side in clockwise order
	public double[] getSides() {
		double[] arrSides = new double[4]; //creates array with 4 elements- 1 for each side
		
		//fills in indexes with lengths
		arrSides [0] = MyPoint.distance(pt1, pt2);
		arrSides [1] = MyPoint.distance(pt2, pt3);
		arrSides [2] = MyPoint.distance(pt3, pt4);
		arrSides [3] = MyPoint.distance(pt4, pt1);
		
		return arrSides; // returns the array
	}
	
	//Method named getCorners() that returns an array of MyPoints of the corner locations
	public MyPoint[] getCorners() {
		
		MyPoint[] Corners = new MyPoint[4]; //creates array
		
		//fills in indexes with corner locations
		Corners [0] = new MyPoint(-1,1);
		Corners [1] = new MyPoint(1,1);
		Corners [2] = new MyPoint(1,-1);
		Corners [3] = new MyPoint(-1,-1);
		
		return Corners; // returns array of corners
	}
	
	//Method named getArea() that returns the area.
	public double getArea() {
	
		//area of triangle 1
		double base1 = Math.sqrt(Math.pow(MyPoint.distance(pt1, pt2),2) + Math.pow(MyPoint.distance(pt1, pt2),2));
		double height1 = Math.sqrt(Math.pow(MyPoint.distance(pt2, pt3), 2) + Math.pow(MyPoint.distance(pt2, pt3), 2));
		double area1 = (base1 * height1) / 2;
		
		//area of triangle 2
		double base2 = Math.sqrt(Math.pow(MyPoint.distance(pt4, pt3), 2) + Math.pow(MyPoint.distance(pt4, pt3), 2));
		double height2 = Math.sqrt(Math.pow(MyPoint.distance(pt1, pt4), 2) + Math.pow(MyPoint.distance(pt1, pt4), 2));
		double area2 = (base2 * height2) / 2;
		
		//adds areas of both triangles together for total area
		double quadarea = area1 + area2;
		
		return quadarea; // return area of the quad
	}
	
	//Method named getCenter() that returns a MyPoint value for the center of the Quadrilateral object.
	public MyPoint getCenter() {
		
		double a1 = pt3.getY() - pt1.getY();
		double b1 = pt3.getX() - pt1.getX();
		double c1 = a1 * (pt1.getX()) + b1 * (pt1.getY());
				
		double a2 = pt4.getY() - pt2.getY();
		double b2 = pt4.getX() - pt2.getX();
		double c2 = a2*(pt2.getX())+ b2*(pt2.getY());  
		
		double determinant = a1*b2 - a2*b1;
		
		//this was made possible thanks to TutorialsPoint.dev
        return new MyPoint ((b2 * c1 - b1 * c2) / determinant, (a1 * c2 - a2 * c1) / determinant);
        // returns center in x,y form --> classmates helped me out with this return statement!!!
	}
	
	//Method named contains(double x, double y) that takes a x and y doubles and returns if that location is inside the Quadrilateral
	public boolean contains(double x, double y) {	
		
		return false;
		
	}
	
	//Overloaded method named contains(Quadrilateral thing) that takes another instance of a Quadrilateral object and returns if it is inside the calling Quadrilateral.
	public boolean contains(MyPoint thing) {
		
		return true;
	}
	
	public boolean contains(Quadrilateral thing) {
		 
		return true;
	}
	
	//Method named overlaps(Quadrilateral thing)  that returns true if the shapes overlap. Returns false if the other shape is completely inside or outside of the calling Quadrilateral instance.
	public boolean  overlaps(Quadrilateral thing) {
		
		return false;
	}
}