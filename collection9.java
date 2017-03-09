import java.util.*;
public class collection9
{
public static void main(String []args)
{
HashSet<String> set = new HashSet<String>();
set.add("Ravi");
set.add("Vijay");
set.add("Piyush");
set.add("Ajay");


Iterator<String> itr= set.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}