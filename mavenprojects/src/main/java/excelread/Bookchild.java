package excelread;

import java.io.IOException;

public class Bookchild {

	public static void main(String[] args) throws IOException {
		System.out.println(Book1.getIntegerData(1, 1));
		System.out.println(Book1.getStringData(0, 0));
		System.out.println(Book1.getIntegerData(2, 1));
		System.out.println(Book1.getIntegerData(3, 1));
	}

}
