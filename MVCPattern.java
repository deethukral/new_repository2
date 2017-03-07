public class MVCPattern
{
public static void main(String []args)
{
Student model= retriveStudentFromDatabase();

StudentView view = new StudentView();
controller.updateView();

controller.setStudentName("Olivia");

controller.updateView();
}

private static Student retrieveStudentFromDatabase()
{
Student student=new Student();
student.setNamae("Sherlock");
student.setRollNo("10");
return student;
}

}