class DoWhileDemo 
{
	public static void main(String[] args) 
	{
	java.util.Scanner scan= new java.util.Scanner(System.in);
	int  n,c=0,r,max,min;//r,max=-9,min=9;
	System.out.println("enter a number");
	 n=scan.nextInt();
	 max=min=n%10;
	/*do
	{
		c++;
		n=n/10;

	}
	while (n!=0);
	System.out.println("NuMber of digits are:  "+c);

	do{
		r=n%10;
		if(max<r)max=r;
		if(min>r)min=r;
		n=n/10;
		}while(n!=0);
	System.out.println("min no is: "+min+"  max no is : "+max);

	while(n!=0){
		r=n%10;
		c=c*10+r;
		n=n/10;
	}
	System.out.println("NuMber of digits are:  "+c);
	if(n<0){
		System.out.print("-");
		n=-n;
	}
		do{
			System.out.print(n%10);
			n=n/10;
		}while(n!=0);
		System.out.println();

	n=Math.abs(n);
	System.out.println("even no is="+n/2+"\todd no is="+(n+1)/2); 
	int en=0,on=0;
	n=Math.abs(n);
	while(n!=0){
	if(n%2==0)en++;
	else on++;
	n--;
	}
System.out.println("even number is=\t"+en +"\todd no is="+on);*/
		int en=0,on=0,z=0;
		do{
			r=n%10;
			if(r==0) z++;
			else if(r%2==0)en++;
			else on++;
		     n=n/10;
		}
		while (n!=0);
System.out.println("even number is=\t"+en +"\todd no is="+on+"\t zero is"+z);

	}
}
