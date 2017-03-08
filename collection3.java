import java.util.*;

public class collection3
{
public static void main(String []args)
{
Student s1= new Student(101, "Sonu",23);
Student s2= new Student(102, "Ravi",21);
Student s3= new Student(103, "Hanumat",25);

ArrayList<Student> list= new ArrayList<Student>();

list.add(s1);
list.add(s2);
list.add(s3);

Iterator itr= list.iterator();

while(itr.hasNext())
{
Student st= (Student)itr.next();
System.out.println(st.rollno+" "+st.name+" "+st.age);
}
}

}