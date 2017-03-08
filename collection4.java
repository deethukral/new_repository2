import java.util.*;
class collection4
{
public static void main(String args[])
{
ArrayList<String> a= new ArrayList<String>();
a.add("Ravi");
a.add("Vijay");
a.add("Ajay");
ArrayList<String> a2= new ArrayList<String>();
a2.add("Sonu");
a2.add("Hanumat");
a.addAll(a2);
Iterator itr= a.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}