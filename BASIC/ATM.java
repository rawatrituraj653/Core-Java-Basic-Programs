class ATM
{
	public static void main(String[] args) 
	{
		java.util.Scanner scan= new java.util.Scanner(System.in);
		int pin, c=1a;
		while(true){
			System.out.println("enter pin number");
		 pin=scan.nextInt();
		if(pin==1234){
			System.out.println("WELLCOME TO CITI BANK");
			break;
		}
		else if(c==3){
			System.out.println("YOU ATM BLOCKED FOR 24 HOURS");
			break;
		}
		else{	
			System.out.println("INVALID PIN");
		}
		c++;
		

		}
		
	}
}
