import java.util.*;
 
public class collection
{
public static void main(String []args)
{
ArrayList<String> list = new ArrayList<String>(); //Generic arrayList
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");

Iterator itr= list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}