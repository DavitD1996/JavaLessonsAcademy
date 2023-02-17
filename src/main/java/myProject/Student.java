package myProject;

public class Student extends Person{
    private static int valueForId;
    private int studentId;
    public Student(){
        super();
        studentId=++valueForId;
    }
    public Student(String name, int age, String gender){
        super(name,age,gender);
        studentId=++valueForId;
    }
    public void AddCourse(String course){
        super.AddLesson(course);
    }
    public void printStudentID(){
        System.out.println(this.studentId);
    }
}
