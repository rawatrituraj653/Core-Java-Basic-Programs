class Array6{
	
	public static void main(String[] args){
	java.util.Scanner scan=new java.util.Scanner(System.in);
		
		int n,i,ele,pos;int []a=new int[20];
	
	System.out.println("enter a Array size from 1to 20");
		 n=scan.nextInt();
		 System.out.println("enter "+n+" integer");
		 for(i=0;i<n;i++)a[i]=scan.nextInt();
		 System.out.println("enter a new element and position");
		 ele= scan.nextInt();
		pos=scan.nextInt();
		if(pos<1 || pos>n+1){
		System.out.println("position between 1 to "+n+1 +" only");
		}
		else{
		for(i=n;i>=pos;i--)a[i]=a[i-1];
		a[i]=ele;
	System.out.println("ELEMENTS ARE ");
	for(i=0;i<=n;i++){
		System.out.print("\t"+a[i]);
		}
		System.out.println();
		}
		
		
	}
}