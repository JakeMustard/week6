package Debugging;

public class Debugging {

	public static void main(String[] args) {
        Classroom classroom = new Classroom(3);

        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Bob", 19);
        Student student3 = new Student("Charlie", 21);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        Student[] students = classroom.getStudents();

        for (Student student : students) {
            if (student != null) {
                System.out.println("Name: " + student.getName() + ", Age: " + student.getAge());
            }
        }
    }
}
