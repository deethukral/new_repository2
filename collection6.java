import java.util.*;  
class collection6
{
  
 public static void main(String args[])
{  
  ArrayList<String> a=new ArrayList<String>();  
  a.add("Ravi");  
  a.add("Vijay");  
  a.add("Ajay");  
  ArrayList<String> a2=new ArrayList<String>();  
  a2.add("Ravi");  
  a2.add("Hanumat");  
  a.retainAll(a2);  
  System.out.println("iterating the elements after retaining the elements of a2...");  
  Iterator itr=a.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  