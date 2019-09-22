class Test2 {
	public static void main(String[] args) 
	{
	int m,n,r,s=0,c=0;
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("enter a number");
	 n=scan.nextInt();
	/*do{
		if(n%100<10 && n>9) System.out.print("0");
		System.out.print("\t"+n%100);
		n/=100;	
	}while(n!=0);
	System.out.println();
	m=n;
	while(n!=0){
	r=n%10;
	s=s+r*r*r;
	n=n/10;
	}
	if(m==s)System.out.println(" it is ArmStrong number");
	else System.out.println(" it is not ArmStrong number");*/
	m=n;
	while(m!=0){
	c++;
	m=m/10;
	}
	m=n;
	while(m!=0){
	r=m%10;
	int e=(int)Math.pow((int)r,(int)c);
	//System.out.print(e);
	s=s+e;
	m=m/10;
	}//System.out.println(s);
	if(n==s)System.out.println(" it is ArmStrong number");
	else System.out.println(" it is not ArmStrong number");
	}
}
