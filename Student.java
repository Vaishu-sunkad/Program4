class Course {
    String courseName;
    int marks;

    Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }
}
public class Student {
    String name;
    String program;
    int semester;
    Course[] courses;

    Student(String name, String program, int semester, Course[] courses) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = courses;
    }

    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
    }

    void displayLowMarks() {
        System.out.println("Courses with marks < 40:");
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println(" - " + c.courseName + ": " + c.marks + " marks");
            }
        }
    }

    public static void main(String[] args) {
        Course[] courseList = {
            new Course("Math", 78),
            new Course("Physics", 32),
            new Course("Chemistry", 89),
            new Course("English", 35)
        };

        Student s = new Student("Alice", "B.Sc", 2, courseList);

        s.displayStudentInfo();
        System.out.println(); // Just for spacing
        s.displayLowMarks();
    }
}
