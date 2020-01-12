package tw.ptl.apps;

import tw.org.iii.apps.tool.Student;

public class PTL27 {
//搭配Student
	public static void main(String[] args) {
		Student s1 = new Student("PTL");
		s1.setCh(100);s1.setEng(99);s1.setMath(98);
		System.out.println(s1.toString());
	}
}
