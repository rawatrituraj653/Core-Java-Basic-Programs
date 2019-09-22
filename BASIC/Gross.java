class Gross 
{
	public static void main(String[] args) 
	{
		double basic=12000,da=basic*104/100,bonus,comm,gross;
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter  gross cutting");
		int sales=scan.nextInt();
		if(sales>=100000){
			bonus=basic*10/100;
			comm=1000;
		
		}
		else {
		bonus =basic*5/100;
		comm=500;
		}
		gross=basic+da+bonus+comm;
		System.out.println("your sales is"+sales);
		System.out.println("the basic sal is"+basic);
		System.out.println("the DA  is"+da);
		System.out.println("the  comm is"+comm);
		System.out.println("the Bonus is"+bonus);
		System.out.println("the GROSS SAL is"+gross);
	}
}
