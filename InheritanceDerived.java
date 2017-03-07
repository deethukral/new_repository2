class InheritanceBase
{
int rollnum;
public InheritanceBase()
{
System.out.println(" u r in base class default constructor");

}

public InheritanceBase(int r)
{
System.out.println("u r in base class parameterised constructor");
rollnum=r;
}

public void display()
{
System.out.println("hello");
System.out.println("roll number is:"+rollnum);
}


}


public class InheritanceDerived extends InheritanceBase 
{

public InheritanceDerived()
{

System.out.println("you are in derived class constructor");
}
public static void main(String []args)
{


InheritanceDerived obj= new InheritanceDerived();
obj.display();

}

}