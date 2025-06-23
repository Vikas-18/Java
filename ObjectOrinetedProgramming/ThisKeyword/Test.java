package ObjectOrinetedProgramming.ThisKeyword;

public class Test {


    public static void main(String[] args) {
        Student student = new Student();

        System.out.println("Name: "+ student.name);
        System.out.println("Marks: "+student.marks);
        System.out.println("RollNo: "+student.rollNo);

        Student student1 = new Student("Virat",18,100);

        System.out.println("Name: "+ student1.name);
        System.out.println("Marks: "+student1.marks);
        System.out.println("RollNo: "+student1.rollNo);


    }
}
