import java.util.*;

public class ListEx
{
public static void main(String []args)
{
ArrayList<String> a=new ArrayList<String>();
a.add("Amit");
a.add("Vijay");
a.add("Piyush");
a.add(1,"Sachin");

System.out.println("Element at 2nd position:"+a.get(2));

for(String s:a)
{
System.out.println(s);
}
}
}