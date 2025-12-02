package assignments;

public class AreacircleSquareRectangl {
static double area(double r) {
	return 3.14*r*r;
}
static int area(int l,int b) {
	return l*b;
}
static int area(int a) {
	return a*a;
}
	public static void main(String[] args) {
		System.out.println("circle Area: "+area(2.1));
		System.out.println("rectangle area :"+area(4,6));
		System.out.println("square area :"+area(2));
	}

}
