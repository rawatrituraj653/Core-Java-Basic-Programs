import java.util.Scanner;
class Assign1 
{
	public static void main(String[] args) 
	{
		int n,rev=0,r,c=0,s=0 ;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		n=scan.nextInt();
		  System.out.print(n+"= ");
		while(n%10==0){//counting zeros
			r=n%10;
			if(r==0)c++;
			n=n/10;
		}
		 while(n!=0){ //reversing no
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		 }
	 while(rev!=0){
			r=rev%10;
			s=s+r;
		 System.out.print(r+"+");
			rev=rev/10;
		 }
	while (c>=1)
	{
	System.out.print("0+");
	c--;
	}
		 System.out.println("\b= "+s+"\n");

	}
}

