package myProject;

public class MyTypeException extends Exception{
    public MyTypeException(){
       super("The data type was not converted correctly");
    }
}
