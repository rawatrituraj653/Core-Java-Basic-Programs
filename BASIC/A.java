class A 
{
	public static void main(String[] args) 
	{
/*	for (int i=0;i<=10 ;i++ ){
		if(i==3||i==5)continue;
		System.out.println(i);
	}*/
	int i,n; float mean,sum=0;
	java.util.Scanner scan=new java.util.Scanner(System.in);
	System.out.println("enter a number");
	n=scan.nextInt();
	for(i=0;i<=n;i++){
		sum=sum+i;
	}
	mean=sum/n;
	System.out.println("sum is  :  "+(int)sum);
	System.out.println("Mean is :  "+mean);
	}
}
