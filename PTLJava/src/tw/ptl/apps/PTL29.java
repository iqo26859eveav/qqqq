package tw.ptl.apps;

import tw.org.iii.apps.tool.Student;

public class PTL29 {
// 多型的範例
	public static void main(String[] args) {
		P291 obj1 = new P291();
		P292 obj2 = new P292();
		Student obj3 = new Student("PTL");
		doSomething(obj1);

	}
	static void doSomething(Javaer javaer) {
		javaer.OCAJP();
	}
}
interface Javaer {
	void OCAJP();
	void OCPJP();
}
class P291 implements Javaer{

	public void OCAJP() {System.out.println("A");	}
	public void OCPJP() {	}
	
}
class P292 implements Javaer{

	public void OCAJP() {System.out.println("B");	}
	public void OCPJP() {	}
	
}