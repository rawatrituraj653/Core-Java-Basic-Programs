class ForDemo 
{
	public static void main(String[] args) 
	{
		int t,i,s=0;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("Enter a Number");
		t=scan.nextInt();
		/*for(i=1;i<=10;i++){
			System.out.println(t+"*"+i+"="+t*i);
		}
		for(i=1;i<=t;i++){
		System.out.print(i+"+");
		s=s+i;
		}
		System.out.println("\b =  "+s);
		for(i=0;i<=255;i++){
		System.out.println(i+"=\t"+(char)i);
		}
		
		for(i=1;i<=t;i++){
			System.out.print(i+"\t");
		if(i%2==0)System.out.print(i*2+"\t");
		}
		System.out.println();
		
		for(i=1;t!=0;t--)i=i*t;
			System.out.println("Factorial ="+i);

		for(i=1;i<=t/2;i++)if(t%i==0)s=s+i;
		if(t==s)System.out.println("perfect Number");
		else System.out.println("not a perfect Number");
		*/
		for(i=1;i<=t;i++){
			if(t%i==0)s++;

		}
		if(s==2)		System.out.println("prime Number");
		else 		System.out.println("Not a prime No");



		
	}
}
