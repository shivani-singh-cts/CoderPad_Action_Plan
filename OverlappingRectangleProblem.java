package com.coderpad.preparation;

class Point	{
	int x;
	int y;
}
public class OverlappingRectangleProblem {

	static boolean doRectanglesOverlap(Point l1, Point r1, Point l2, Point r2) {
		/*Rec1 is on right of Rec2 || Rec1 is on left of Rec2 ||
		Rec1 is above Rec2 || Rec1 is below Rec2 */
		if((l1.x >= r2.x) || (r1.x <= l2.x) || (r1.y >= l2.y) || (l1.y <= r2.y))
			return false;
		else
			return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coordinates of Rectangle1
		Point l1 = new Point();
		Point r1 = new Point();
		l1.x = 0; l1.y = 10;
		r1.x = 10; r1.y = 0;
		
		//Coordinates of Rectangle2
		Point l2 = new Point();
		Point r2 = new Point();
		l2.x = 5; l2.y = 5;
		r2.x = 15; r2.y = 0;
		
		boolean result = doRectanglesOverlap(l1, r1, l2, r2);
		if(result)
			System.out.println("Yes, the rectangles are overlapping");
		else
			System.out.println("No, the rectangles are not overlapping");
	}

}
