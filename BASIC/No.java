class No 
{
	public static void main(String[] args) 
	{
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n,m,s=0,r,c=0;
		System.out.println("enter a number");
		n= scan.nextInt();
		/*;
		m=n;
		while(n!=0){
			r=n%10;
			s=s+r*r*r;
			n/=10;
		}
		if(m==s)System.out.println("ArmStrong Number");
		else 	System.out.println("Not A Armstrong Number");
			
	m=n;
	while(m!=0){
	c++;
	m=m/10;
	}
	m=n;
		System.out.println(c);
		System.out.println(m);
		System.out.println(n);
	while(m!=0){
	r=m%10;
	s=s+(int)Math.pow(r,c);
	m=m/10;
	}
	if(n==s)System.out.println("ArmStrong Number");
		else 	System.out.println("Not A Armstrong Number");*/
		do{
		if(n%100<10 && n>9)System.out.print("0");
			System.out.print("\t");
			System.out.print(n%100);
			n/=100;	
		}while(n!=0);
	System.out.println();

	}
}
