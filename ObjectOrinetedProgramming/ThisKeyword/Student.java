package ObjectOrinetedProgramming.ThisKeyword;

public class Student {
    String name;
    int rollNo;
    int marks;

    Student()
    {
        this.marks = 1;
        this.rollNo =18;
        this.name = "Vikas";
    }

    Student(String name,int rollNo,int marks)
    {
        this.name = name;
        this.rollNo =rollNo;
        this.marks = marks;
    }

}
