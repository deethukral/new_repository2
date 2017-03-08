import java.util.*;

class collection5
{
public static void main(String args[])
{
ArrayList<String> a= new ArrayList<String>();
a.add("Ravi");
a.add("Vijay");
a.add("Ajay");

ArrayList<String> a2= new ArrayList<String>();
a2.add("Ravi");
a2.add("Nancy");

a.removeAll(a2);
System.out.println("Iterating the elements after removing the elements of a2");
Iterator itr= a.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}

}