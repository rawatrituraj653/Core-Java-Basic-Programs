class Array5{
	public static void main(String[] args){
	java.util.Scanner scan=new java.util.Scanner(System.in);
		int n,i,t;int []a=new int[20];
	System.out.println("enter a Table");
		 n=scan.nextInt();
	System.out.println("enter "+n+" table no");
	for(i=0;i<n;i++){
		a[i]=scan.nextInt();
	}
		for(i=1;i<=10;i++){
			for(t=0;t<n;t++){
			System.out.print("  "+a[t]+" * "+i+" =   "+a[t]*i);
			}
			System.out.println();
		}
	}
}