package myProject;

import java.util.ArrayList;

public abstract class Person {
    private  enum Gender{
        Male,Female;
    }
    private String name;
    private int age;
    private Gender gender;
    private ArrayList<String>Lessons;
    public Person(){};
    public  Person(String name, int age,String gender){
        Lessons=new ArrayList<>();
        this.name=name;
        this.age=age;
            switch (gender.toLowerCase()){
                case "male":
                    this.gender=Gender.Male;
                    break;
                case "female":
                    this.gender=Gender.Male.Female;
                    break;
                default:
                    System.out.println("incorrect data");
                    break;
            }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }


    public  void DisplayInfo(){
        System.out.print(this.getName()+" is "+this.getAge()+" years old and he/she is "+this.getGender());
    }
    public void AddLesson(String Lesson){
        Lessons.add(Lesson);
    }

}
