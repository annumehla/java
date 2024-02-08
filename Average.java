import java.util.Scanner;
public class Average {
    public static void main(String args[])
    {
	Scanner input=new Scanner(System.in);
        int a,b,c;
	int i=0;
	do
	{
	System.out.println("Enter Integer values for performing operations");
	a=input.nextInt();
	b=input.nextInt();
	c=input.nextInt();
        float add,sub,mul,div;
	String operation;
	input.nextLine();
	
	
	operation=input.nextLine();
	if(operation.equals("add"))
	{
		System.out.println("Addition of numbers is"+ addition(a,b,c));
	}
	else if(operation.equals("sub"))
	{
		System.out.println("Subtraction of numbers is" +(a-b-c));
	}
	else if(operation.equals("mul"))
	{
		System.out.println("Multiplication of numbers is" +(a*b*c));	
	}
	else if(operation.equals("div"))
	{
		System.out.println("Division of numbers is" + ((a/b)/c));
	}
	else
	{
		System.out.println("Operation not matched");
	}
	System.out.println("Do you want to use calculator again: if yes then press 1 otherwise 0");
	i=input.nextInt();
	} while(i==1);

    }
	int addition(int a, int b, int c)
	{
		return (a+b+c);
	}
}
