package sec06.exam07_Wild_Card;

import java.util.Arrays;

public class WildCardExample {
	public static void registerCourse( Course<?> course) {
		System.out.println(course.getName() + " 수강생: "+ 
				Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent( Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: "+ 
				Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseWorker( Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: "+ 
				Arrays.toString(course.getStudents()));
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인 과정", 5);
			personCourse.add(new Person("일반인"));
			personCourse.add(new Worker("직장인"));
			personCourse.add(new Student("학생"));
			personCourse.add(new HighStudent("고등학생"));
			
		Course<Worker> workerCourse = new Course<Worker>("직장인 과정", 5);
//			workerCourse.add(new Person("일반인"));
			workerCourse.add(new Worker("직장인"));
//			workerCourse.add(new Student("학생"));
//			workerCourse.add(new HighStudent("고등학생"));
			
		Course<Student> studentCourse = new Course<Student>("학생 과정", 5);
//			studentCourse.add(new Person("일반인"));
//			studentCourse.add(new Worker("직장인"));
			studentCourse.add(new Student("학생"));
			studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
//			highStudentCourse.add(new Person("일반인"));
//			highStudentCourse.add(new Worker("직장인"));
//			highStudentCourse.add(new Student("학생"));
			highStudentCourse.add(new HighStudent("고등학생"));
		
			
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(highStudentCourse);
		System.out.println();
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(HighStudentCourse);
		System.out.println();
		
	}

}
