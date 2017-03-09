import java.util.*;

public class collection7
{
public static void main(String []args)
{
LinkedList<String> a=new LinkedList<String>();
a.add("Ravi");
a.add("Vijay");
a.add("Ajay");

Iterator<String> itr=a.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}

}