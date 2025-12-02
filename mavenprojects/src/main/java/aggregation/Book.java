package aggregation;

public class Book {
String bookname;
int number;
Author a; //a is a refference variable of author
public  Book(String bookname,int number,Author a) {
	this.bookname =bookname;
	this.number=number;
	this.a=a;
}

public void print() {
	System.out.println("the name of the book is"+ bookname);
	System.out.println("the number of the book is"+number);
}
	public static void main(String[] args) {
		Author obj= new Author("arsha",5);
		Book b1= new Book("java",100,obj);
		obj.display();
		b1.print();

	}

}
