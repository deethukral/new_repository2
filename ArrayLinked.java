import java.util.*;

public class ArrayLinked
{
public static void main(String []args)
{
List<String> a=new ArrayList<String>();
a.add("Ravi");
a.add("Vijay");
a.add("Ajay");
a.add("Piyush");

List<String> a2=new LinkedList<String>();
a2.add("James");
a2.add("Serena");
a2.add("Swati");
a2.add("Nancy");

System.out.println("arraylist:"+a);
System.out.println("linkedlist:"+a2);
}
}