import java.util.Scanner;
class Leap{
	public static void main(String[]s){
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the year");
	int year=scan.nextInt();
	if(year%4==0&&year%100!=0||year%400==0) System.out.println("leap year");
		else System.out.println("common year");
	
	
	}
}	