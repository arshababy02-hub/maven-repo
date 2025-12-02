package assignments;//WAP TOto find the gfrade 0f 2 students baSED on total(marks 3).get the student marks by construvtr.return total mark to in main methode
//.fin the grade?static method
public class Student {
int m1,m2,m3;
int total;
public  Student(int a,int b,int c) {
	m1=a;
	m2=b;
	m3=c;
	total=m1+m2+m3;
}
static String grade (int total) {
	if(total>=90)
		return "A";
	else if (total>=80)
		return"B";
	else if(total>=70)
		return"c";
	else return"D";
}

	public static void main(String[] args) {
		Student s1=new Student(30,30,30);
		Student s2=new Student(20,25,25);
		System.out.println("student 1 total: "+s1.total + "grade :"+Student.grade(s1.total));
		System.out.println("student 2 total: "+s2.total + "grade :"+Student.grade(s2.total));

	}
	}


