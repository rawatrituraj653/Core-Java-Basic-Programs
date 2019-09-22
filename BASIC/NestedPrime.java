import java.util.Scanner;
class NestedPrime
{
	public static void main(String[] args) 
	{
		int n,t,m,i,j,s=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		n=scan.nextInt();
	/*	for(i=1;i<=n;i++){
		m=i;
		while(m!=0){
			t=m%10;
			s=s*10+t;
			m=m/10;
			}
		if(i==s)System.out.println(i+"palindrome  No"); 	
			else 	System.out.println(i+"Not a palindrome  No");
			s=0;
	}*/
	for(i=1;i<=n;i++){
		s=0;
		for (j=1;j<=i;j++){
			if(i%j==0) s++;
		}
		if(s==2)
	System.out.println(i+"-prime no"); 	
		
	}
		
	}
}