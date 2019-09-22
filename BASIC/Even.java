import java.util.Scanner;
class Even 
{
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number");
		int a=scan.nextInt();
	/*	if(a%2==0) System.out.println("even number");
		else System.out.println("odd number");
	if((a/2)*2==a) System.out.println("even number");
		else System.out.println("odd number");*/
		if((a&1)==0) System.out.println("even number");
		else System.out.println("odd number");
	}
}
