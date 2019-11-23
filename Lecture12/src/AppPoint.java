class Point{
	int x;
	int y;
	
	public Point(){
	}
	public String toString(){
		return "x:" + this.x + " y:" + this.y;
	}
}

public class AppPoint {

	public static void main(String[] args) {
Point startPoint = new Point();
startPoint.x = 0;
startPoint.y = 0;

System.out.println(startPoint);
System.out.println(startPoint.toString());

Point endPoint = new Point (10,10);
System.out.println(endPoint);
	}

}
