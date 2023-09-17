import java.util.Scanner;


public class Display1toN 
{
	public static void print1function(int n)
	{
		if(n==0)
		   return;
		System.out.print(n + " ");	
		print1(n-1);
	}

	public static void print2function(int n)
	{
		if(n==0)
		   return;
		print2(n-1);
		System.out.print(n + " ");	
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("Enter value of n : ");
		n = scan.nextInt();
		
		print1function(n);	
		System.out.println();
		
		print2function(n);	
		System.out.println();
		
		scan.close();
	}
}
