package Basic_concept;

public class Multiplecalling_withArgument {
	public static void main(String[] args) {
		student(15, "sai", "cse");
		employee(582, "software it", 30000);
		college(900, "cse", "ece", "eee");
		family(4, "ravindra", "aruna", "pushpa", "lavanya");
	}

	public static void student(int rollno, String name, String branch) {
		System.out.println("student details");
		System.out.println(rollno);
		System.out.println(name);
		System.out.println(branch);
	}

	public static void employee(int empid, String job, int sal) {
		System.out.println("employee details");
		System.out.println(empid);
		System.out.println(job);
		System.out.println(sal);
	}

	public static void college(int deptid, String course1, String course2, String course3) {
		System.out.println("college details");
		System.out.println(deptid);
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(course3);
	}

	public static void family(int members, String fathername, String mothername, String myname, String sistername) {
		System.out.println("family details");
		System.out.println(members);
		System.out.println(fathername);
		System.out.println(mothername);
		System.out.println(myname);
		System.out.println(sistername);
	}
}