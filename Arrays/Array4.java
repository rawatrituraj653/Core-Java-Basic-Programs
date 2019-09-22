class Array4{
	public static void main(String[] args){
	java.util.Scanner scan=new java.util.Scanner(System.in);
		int n,i;int []a=new int[20];
	System.out.println("enter a number");
		 n=scan.nextInt();
	for(i=0;n!=0;i++,n=n/2)a[i]=n%2;
	System.out.println("Binary number are " );
	for(i--;i>=0;i--)System.out.print(a[i]);
	System.out.println();
	}
}
