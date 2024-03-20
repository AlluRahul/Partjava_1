package Basic_concept;

public class Mltiplecallings_withoutArgument {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		student();
		employee();
		college();
		family();
	}

	public static void student() {
		int rollno = 15;
		String name = "sai";
		String branch = "cse";
		System.out.println("student details");
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(branch);
	}

	public static void employee() {
		int empid = 582;
		String job = "software it";
		int sal = 30000;
		System.out.println("employee details");
		System.out.println(empid);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void college() {
		int deptid = 900;
		String course1 = "cse";
		String course2 = "ece";
		String course3 = "eee";
		System.out.println("college details");
		System.out.println(deptid);
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
	}

	public static void family() {
		int members = 4;
		String fathername = "ravindra";
		String mothername = "aruna";
		String myname = "pushpa";
		String sistername = "lavanya";
		System.out.println("family details");
		System.out.println(members);
		System.out.println(fathername);
		System.out.println(mothername);
		System.out.println(myname);
		System.out.println(sistername);
	}
}
