
public class Point {
	
	private int x;
	private int y;

	
	
	public static void main(String[] args) {
		Point first = new Point(6,5);
		Point second = new Point(3,1);
		first.distance(3,1);
		first.distance();
		System.out.println("distance(2,2) = " + first.distance(2,2));
		Point point = new Point();
		System.out.println("distance()= " + point.distance());
		
	}

	public Point() {
		this(0,0);
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	  
	public double distance() {
		
		double distance = Math.sqrt((this.x - 0)*(this.x - 0) + (this.y  -0 ) * (this.y - 0));
		System.out.println("distance (0,0) = " + distance);
		return distance;
	}
	
	public double distance(int x, int y) {
		double distance = Math.sqrt((this.x - x)*(this.x - x) + (this.y  -y ) * (this.y - y));
		System.out.println("distance (second) = " + distance);
		return distance;
			
		}
	
	public double distance(Point point) {
		 return distance(point.getX(),point.getY());
	}
	

}
 