package geometryclass;
import geometryclass.MyPoint;

public class QuadrilateralTest {
	public static void main(String[] args) {
		System.out.println(" Make a default Quadrilateral object using the no attribute constructor");
		Quadrilateral quad1 = new Quadrilateral();
//		double area1 = quad1.getArea();
//		System.out.println("area[4.0]= " + area1);
			
		System.out.println("--- testing getPerimeter() ---------------------------------------");
		double perimeter1 = quad1.getPerimeter();
		System.out.println("getPerimeter[8.0]= " + perimeter1);
			
		System.out.println("--- testing getCenter() ---------------------------------------");
		MyPoint cent1 = quad1.getCenter();
		System.out.print("center[(-0.0,-0.0)]= ");
		printMyPointLn(cent1);
			
		System.out.println("--- testing getSides() ---------------------------------------");
		double [] sides1 = quad1.getSides();
		printSides(sides1);
			
		System.out.println("--- testing getCorners() ---------------------------------------");
		MyPoint [] corners1 = quad1.getCorners();
		printCorners(corners1);
			
		System.out.println("--- testing contains(points/coordinates) --------------------------");
		boolean containCheck1 = quad1.contains(1.0, 1.0);
		System.out.println("contains point1[true]= " + containCheck1);
			
		MyPoint testPt1 = new MyPoint(1.0, 1.001);
		boolean containCheck2 = quad1.contains(testPt1);
		System.out.println("contains point2[false]= " + containCheck2);
			
		System.out.println("--- testing contains(Quadrilateral otherQuad) --------------------");
		Quadrilateral quad3 = new Quadrilateral(new MyPoint(0.5,0.5), new MyPoint(0.5,0.5), new MyPoint(0.5,0.5), new MyPoint(0.5,0.5));
		boolean containQuad3 = quad1.contains(quad3);
		System.out.println("contains quad3[true]= " + containQuad3);
			
		Quadrilateral quad4 = new Quadrilateral(new MyPoint(0.5,0.5), new MyPoint(3.5,0.5), new MyPoint(3.5,3.5), new MyPoint(0.5,3.5));
		boolean containQuad4 = quad1.contains(quad4);
		System.out.println("contains quad4[false]= " + containQuad4);
			
		System.out.println("--- testing overlaps(Quadrilateral otherQuad) --------------------");
		boolean ovrLap4 = quad1.overlaps(quad4);
		System.out.println("overlaps quad4[true]= " + ovrLap4);
			
			
		System.out.println("====== testing the constructor to catch illegal shapes and fix or default them ======");
		
		Quadrilateral crossQuadsysmetric = new Quadrilateral(new MyPoint(1,1), new MyPoint(5,3), new MyPoint(5,1), new MyPoint(1,3));
		printQuad(crossQuadsysmetric);
			
		Quadrilateral goodQuadsysmetric = new Quadrilateral(new MyPoint(1,1), new MyPoint(5,1), new MyPoint(5,3), new MyPoint(1,3));
		printQuad(goodQuadsysmetric);
		
		Quadrilateral crossQuadskew = new Quadrilateral(new MyPoint(1,1), new MyPoint(6,4), new MyPoint(5,1), new MyPoint(1,3));
		printQuad(crossQuadskew);
		
		Quadrilateral goodQuadskew = new Quadrilateral(new MyPoint(1,1), new MyPoint(5,1), new MyPoint(6,4), new MyPoint(1,3));
		printQuad(goodQuadskew);
		System.out.println();
			
			
		Quadrilateral concave1 = new Quadrilateral(new MyPoint(1,1), new MyPoint(3,5), new MyPoint(5,1), new MyPoint(3,3));
		printQuad(concave1);
	}
		
		//----- Helper methods ---------------------------------------
		public static void printCorners(MyPoint [] cornersLst) {
			System.out.print("corners= ");
			for(int i = 0; i < 4; i++) {
				printMyPoint(cornersLst[i]);
				System.out.print(" ");
			} 
			System.out.println();
		}
		
		public static void printSides(double [] sideLst) {
			System.out.print("side lengths= ");
			for(int i = 0; i < 4; i++) {
				System.out.print(sideLst[i]);
				System.out.print(" ");
			} 
			System.out.println();
		}

		public static void printMyPointLn(MyPoint pnt) {
			System.out.println("("+ pnt.getX() + "," + pnt.getY() + ")");
		}
		
		public static void printMyPoint(MyPoint pnt) {
			System.out.print("("+ pnt.getX() + "," + pnt.getY() + ")");
		}
		
		public static void printQuad(Quadrilateral inQuad) {
			MyPoint[] points = inQuad.getCorners();
			System.out.print("corners= ");
			for (int i = 0; i < 4; i++) {
				printMyPoint(points[i]);
				System.out.print(" ");
			}
			System.out.println();
	}
}
