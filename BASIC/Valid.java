import java.util.Scanner;
class Valid 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the person age");
		int age=scan.nextInt();
		System.out.println("enter the gender");
		String gen=scan.next();
		if(gen.equalsIgnoreCase("m")||gen.equalsIgnoreCase("f")){
		if(age>=21||gen.equalsIgnoreCase("f")&&age>=18)
			 System.out.println("YOu are eligible");
		else System.out.println("you are not eligible");
	}
	else{
		System.out.println("invalid gender");
	}}
}
