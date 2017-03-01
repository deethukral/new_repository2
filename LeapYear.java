import java.util.*;


public class LeapYear
{
public static void main(String []args)
{
int yr;
Scanner scan=new Scanner(System.in);
System.out.println("Enter the year");
yr=scan.nextInt();

if(yr%100==0)
{
    if(yr%400==0)


     System.out.println("Leap year");
     
 	else
	System.out.println("Not Leap year");

}

else
 	{
              if(yr%4==0)
		System.out.println("Leap year");
               
                else 
		System.out.println("Not Leap year");


}

}


}