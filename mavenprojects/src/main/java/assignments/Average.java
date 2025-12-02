package assignments;

public class Average {
	static int average(int a, int b,int c) {
		return (a+b+c)/3;
	}
	static float average(float a,float b,float c) {
		return (a+b+c)/3;

}
public static void main(String[]args) {
	System.out.println("Integer Average: "+ average(10,20,30));
	System.out.println("Float Average: "+ average(10.5f,20.5f,30.5f));
}

 }