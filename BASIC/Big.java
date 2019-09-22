import java.util.Scanner;
class  Big
{
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter three number");
		 a=scan.nextInt();
		 b=scan.nextInt();
		 c= scan.nextInt();
		if(a==b&&a==c)System.out.println("all is equals");
	else if(a>b&&a>c){
			System.out.println("a is big");
		}
	else if(a==b&&a>c)
			System.out.println("a and b are big");
	else if (b==c&&b>a)System.out.println("b and c  both are big");
	else if(a==c&&a>c)System.out.println("a and c both are big");
	else if(b>c){
		System.out.println("b is big");
	}
	else System.out.println("c is big");

	}
}
