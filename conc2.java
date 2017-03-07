class conc
{

conc()
{

System.out.println("Constructor program");
}

conc( int m)
{

System.out.println("Constructor Overloading"+m);
}

public static void main(String args[])
{

conc c = new conc();

}
}

public class conc2
{
public static void main(String args[])
{
conc c = new conc();
conc c1= new conc(10);

}


}