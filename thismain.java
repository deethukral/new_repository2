class This 
{
int rollnumber;
public This(int rollnumber)
{
this.rollnumber=rollnumber;

}
public void display()
{
System.out.println("roll number is:"+rollnumber);

}

}



public class thismain
{
public static void main(String[] args)
{
This obj= new This(5);
obj.display();

}

}