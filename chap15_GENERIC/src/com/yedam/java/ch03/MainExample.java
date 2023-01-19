package com.yedam.java.ch03;

public class MainExample {
	public static void main(String[] args) {
		// Course1
		Course.registerCourse1((new Applicant<Person>(new Person())));
//	위 아래 코드 같은것.
//	Person person = new Person();
//	Applicant<Person> applicant = new Applicant<>(person);
//	Course.registerCourse1(applicant);

		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));

//		course2 는 제네릭 타입을 최종자손 Worker와 부모들로 제한 해뒀다.
		Course.registerCourse2((new Applicant<Person>(new Person())));
		Course.registerCourse2(new Applicant<Worker>(new Worker()));
//		Course.registerCourse2(new Applicant<Student>(new Student()));
//		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
	
		
//		course3 은 제네릭 타입을 부모 Student와 자식들로 제한  해뒀다
//		Course.registerCourse3((new Applicant<Person>(new Person())));
//		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	
	}
}
