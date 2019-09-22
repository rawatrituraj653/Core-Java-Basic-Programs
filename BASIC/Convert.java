class Convert{
	public static void main(String []s){
	int n,rev=0,z=0,r,m;
	java.util.Scanner scan= new java.util.Scanner(System.in);
	System.out.println("Enter a Number");
	 n=scan.nextInt();
	if(n<0){
		System.out.print("-");
		n=-n;
	}
	while(n!=0 && n%10==0){
		z++;
		n=n/10;
	}
	do
	{
		r=n%10;
		rev=rev*10+r;
		n=n/10;
	}while (n!=0);
	
	do{
		r=rev%10;
		switch(r){
		case 0 :System.out.print("zero");break;
		case 1 :System.out.print("one");break;
		case 2 :System.out.print("two");break;
		case 3 :System.out.print("three");break;
		case 4 :System.out.print("four");break;
		case 5 :System.out.print("five");break;
		case 6 :System.out.print("six");break;
		case 7 :System.out.print("seven");break;
		case 8 :System.out.print("eight");break;
		case 9 :System.out.print("nine");break;
		}
		rev=rev/10;
	System.out.print(" ");
	}while (rev!=0);
		while(z>=1) {
		System.out.print("zero  ");
		z--;
		}
		System.out.println();
	}
}