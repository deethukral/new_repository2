import java.util.*;
public class collection8
{
public static void main(String []args)
{
ArrayList<String> a= new ArrayList<String>();
a.add("amit");
a.add("vijay");
a.add("piyush");
a.add(1,"sachin");

System.out.println("element at 2nd position"+a.get(2));

ListIterator<String> itr= a.listIterator();
System.out.println("traversing elemets in forward direction");
while(itr.hasNext())
{
System.out.println(itr.next());
}

System.out.println("traversing elemets in backward direction");
while(itr.hasPrevious())
{
System.out.println(itr.previous());
}
}
}