class IRCTC 
{
	public static void main(String[] args) 
	{
	String user,pass,captcha;
	java.util.Scanner scan= new java.util.Scanner(System.in);
	System.out.println("eneter user id");
	user= scan.next();
	System.out.println("enter password");
	 pass=scan.next();
	 System.out.println("enter Captcha");
	 captcha=scan.next();
	 if(user.equals("Rituraj")){
			if(pass.equals("Rawat")){
			if (captcha.equals("R1A2"))
				System.out.println("WLECOME TO IRCTC");
			else System.out.println("INVALID CAPTCHA");
			}
	else System.out.println("INVALID PASSWORD");
	}
else System.out.println("INVALID USER ID");
	}
}