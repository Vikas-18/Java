package ObjectOrinetedProgramming.CopyConstructor;

public class Test {
    public static class Student{
        String name;
        int marks;

        Student()
        {
            this.name = "Vikas";
            this.marks = 100;
        }

        Student(String name, int marks)
        {
            this.name = name;
            this.marks = marks;
        }
        // passing a class into constructor
        Student(Student other)
        {
            this.marks = other.marks;
            this.name = other.name;
        }

    }
    public static void main(String[] args) {
        Student student = new Student("Vikas",100);
        Student student1 = new Student(student);

        System.out.println(student1.name);
    }
}
