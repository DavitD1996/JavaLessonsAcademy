package myProject;

public class Teacher extends Person{
    private static int valueForId;
    private int employeeId;
    public Teacher(String name, int age, String gender){
        super(name, age,gender);
        employeeId=++valueForId;
    }
    public Teacher(){
        super();
        employeeId=++valueForId;
    }
    public void AddSubject(String subject){
        super.AddLesson(subject);
    }
    public void printTeacherID(){
        System.out.println(this.employeeId);
    }
}
