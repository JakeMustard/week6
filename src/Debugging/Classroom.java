package Debugging;


class Classroom {
    private Student[] students;

public Classroom(int size) {
    students = new Student[size];
}

public void addStudent(Student student) {
    for (int i = 0; i <= students.length; i++) { // Logical error: should be i < students.length
        if (students[i] == null) {
            students[i] = student;
            break;
        	}
        
    	}
    }

public Student[] getStudents() {
    return students;
}
}