package tw.org.iii.apps.tool;

public class Student {	//搭配PTL27
	private String name;
	private int ch, eng, math;
	public Student(String name) {
		this.name = name;
	}
	public void setCh(int ch) {this.ch = ch;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math = math;}
	
	public String toString() {
		return name + ":" +ch+":"+eng+":"+math;
	}
}
