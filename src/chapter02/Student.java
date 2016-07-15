package chapter02;

public class Student extends Person {
	public Student(){
		System.out.println("학생 학생");
	}
	public Student(int i){
		System.out.println("학생(int i) 학생");
	}
	
	public void showInfo(){
		System.out.println(age); //부모의 defalt 접근 가능함
		//System.out.println(name); //private 접근 안돼
		System.out.println(height);
		System.out.println(weight);  //부모의 protected 접근됨(자식만 가능하다)
		
	}

}
