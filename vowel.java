import java.util.*;

public class vowel 
{

public static void main(String args[])

{

String ch;
 
Scanner scan= new Scanner(System.in);
System.out.println("Enter a character");
ch=scan.nextLine();
Switch(ch)
{

 	case "A":
	System.out.println("Vowel");
	break;
	case "E":
	System.out.println("Vowel");
	break;
	case "I":
	System.out.println("Vowel");
	break;
	case "O":
	System.out.println("Vowel");
	break;
	case "U":
	System.out.println("Vowel");
	break;

	default :
	System.out.println("consonant");
	break;

}

}



}