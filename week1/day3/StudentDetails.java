package week1.day3;

public class StudentDetails {
	String studentName= "Balaji";
	long studentRollNum=7657886564454L;
	short studentAge= 14;
	char studentFirstLetter='B';
	float percentage= 97.9f;
	boolean isPass= false;
	public static void main(String[] args) {
		StudentDetails student=new StudentDetails();
		System.out.println(student.studentName);
		System.out.println(student.studentRollNum);
		System.out.println(student.studentAge);
		System.out.println(student.studentFirstLetter);
		System.out.println(student.percentage);
		System.out.println(student.isPass );
		

	}

}
